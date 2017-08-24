package netgloo.models;
// Generated Aug 25, 2017 1:26:26 AM by Hibernate Tools 5.2.3.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.search.annotations.ContainedIn;
import org.hibernate.search.annotations.Field;

/**
 * SubUsers generated by hbm2java
 */
@Entity
@Table(name = "sub_users", catalog = "aaconversion")
public class SubUsers implements java.io.Serializable {

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "subId", column = @Column(name = "sub_id", nullable = false)) })
	private SubUsersId id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@ContainedIn
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	private Users users;
	
	@Field
	@Column(name = "sub_name", nullable = false)
	private String subName;

	public SubUsers() {
	}

	public SubUsers(SubUsersId id, Users users, String subName) {
		this.id = id;
		this.users = users;
		this.subName = subName;
	}

	public SubUsersId getId() {
		return this.id;
	}

	public void setId(SubUsersId id) {
		this.id = id;
	}
	
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getSubName() {
		return this.subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

}
