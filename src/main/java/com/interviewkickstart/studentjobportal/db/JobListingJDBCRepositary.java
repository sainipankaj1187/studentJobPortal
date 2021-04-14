package com.interviewkickstart.studentjobportal.db;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.interviewkickstart.studentjobportal.entity.JobListing;
import com.interviewkickstart.studentjobportal.entity.JobListingSearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;
import java.util.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class JobListingJDBCRepositary {

    private static final String INSERT_NEW_JOBLISTING_SQL = "insert into `JobListing` (`id`,`company`,`location`,`reqExperience`,`description`,`type`,`contactHR`,`createdDate`,`updatedDate`,`isActive`) values " +
            "(?,?,?,?,?,?,?,?,?,?)";

    private static  final String baseQuery = "select * from JobListing ";

   // private static final String SEARCH_FROM_JOBLISTING_SQL = "select * from `JobListing` where ";
    @Autowired
    JdbcTemplate jdbcTemplate;

    class JobListingRowMapper implements RowMapper<JobListing> {
        @Override
        public JobListing mapRow(ResultSet rs, int rowNum) throws SQLException{

            JobListing jobListing = new JobListing();
            jobListing.setId(rs.getString("id"));
            jobListing.setCompany(rs.getString("company"));
            jobListing.setLocation(rs.getString("location"));
            jobListing.setReqExperience(rs.getInt("reqExperience"));
            jobListing.setDescription(rs.getString("description"));
            jobListing.setType(rs.getString("type"));
            jobListing.setContactHR(rs.getString("contactHR"));
            jobListing.setCreatedDate(rs.getTimestamp("createdDate"));
            jobListing.setUpdatedDate(rs.getTimestamp("updatedDate"));
            jobListing.setIsActive(rs.getBoolean("isActive"));
            return jobListing;
        }
    }

    public int insert(JobListing jobListing){
        return jdbcTemplate.update(INSERT_NEW_JOBLISTING_SQL, new Object[]{jobListing.getId(), jobListing.getCompany(), jobListing.getLocation(), jobListing.getReqExperience(), jobListing.getDescription(),
                jobListing.getType(), jobListing.getContactHR(), jobListing.getCreatedDate(), jobListing.getUpdatedDate(), jobListing.getIsActive()});
    }

    public Object searchJobListings(JobListingSearchRequest jobListing){

        if(jobListing.getFilters()!=null && !jobListing.getFilters().isEmpty()) {

            Map<String,String> filters = jobListing.getFilters();

            List<Object> params = new ArrayList<>();

            StringBuilder query = null;
            for (String key : filters.keySet()
                 ) {
                if(query== null) {
                     query = new StringBuilder(baseQuery);
                     query.append(" where ");
                    query.append(" " + key + "= ? ");
                    params.add(filters.get(key));
                }else{
                    query.append(" AND ");
                    query.append(" " + key + "= ? ");
                    params.add(filters.get(key));
                }

            }

            System.out.println(query.toString());
            return jdbcTemplate.query(query.toString(), new JobListingRowMapper(), params.toArray());

        }
        else{
            return jdbcTemplate.query(baseQuery, new JobListingRowMapper());

        }
    }


}

