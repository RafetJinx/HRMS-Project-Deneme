package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_seekers")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name="user_id", referencedColumnName = "id")
public class JobSeeker extends User {
	
//	@Id
//	@GeneratedValue
//	@Column(name="jobSeeker_id")
//	private int job_seeker_id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="national_identity_number")
	private String national_identity_number;
	
	@Column(name="date_of_birth")
	private Date date_of_birth;

//	public JobSeeker() {
//		super();
//	}
//
//	public JobSeeker(int job_seeker_id, String first_name, String last_name, String national_identity_number,
//			Date date_of_birth) {
//		super();
//		this.job_seeker_id = job_seeker_id;
//		this.first_name = first_name;
//		this.last_name = last_name;
//		this.national_identity_number = national_identity_number;
//		this.date_of_birth = date_of_birth;
//	}
//	
}
