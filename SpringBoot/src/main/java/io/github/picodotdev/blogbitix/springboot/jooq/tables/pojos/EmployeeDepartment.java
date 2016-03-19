/**
 * This class is generated by jOOQ
 */
package io.github.picodotdev.blogbitix.springboot.jooq.tables.pojos;


import io.github.picodotdev.blogbitix.springboot.jooq.tables.interfaces.IEmployeeDepartment;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployeeDepartment implements IEmployeeDepartment {

	private static final long serialVersionUID = -586080156;

	private Long id;
	private Long employeeId;
	private Long departmentId;

	public EmployeeDepartment() {}

	public EmployeeDepartment(EmployeeDepartment value) {
		this.id = value.id;
		this.employeeId = value.employeeId;
		this.departmentId = value.departmentId;
	}

	public EmployeeDepartment(
		Long id,
		Long employeeId,
		Long departmentId
	) {
		this.id = id;
		this.employeeId = employeeId;
		this.departmentId = departmentId;
	}

	@NotNull
	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Long getEmployeeId() {
		return this.employeeId;
	}

	@Override
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public Long getDepartmentId() {
		return this.departmentId;
	}

	@Override
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("EmployeeDepartment (");

		sb.append(id);
		sb.append(", ").append(employeeId);
		sb.append(", ").append(departmentId);

		sb.append(")");
		return sb.toString();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IEmployeeDepartment from) {
		setId(from.getId());
		setEmployeeId(from.getEmployeeId());
		setDepartmentId(from.getDepartmentId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IEmployeeDepartment> E into(E into) {
		into.from(this);
		return into;
	}
}