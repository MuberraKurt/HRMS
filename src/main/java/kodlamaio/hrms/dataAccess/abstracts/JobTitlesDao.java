package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobTitles;

public interface JobTitlesDao extends JpaRepository<JobTitles,Integer>{ //Integer is data type of JobTitle's primary key (JobTitles id=integer) 
	//JpaRepository brings CRUD operations automatically
}
