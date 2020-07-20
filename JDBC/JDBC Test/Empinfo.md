``` java  
package com.bit.model.dto_deans;
/**
 * 사원번호, 사원이름, 부서명, 부서의위치, 작업명, 급여액
 * @author bitcamp
 *
 */
public class Empinfo {
	private int empNo; // emp.empno
	private String empName; // emp.ename
	private String deptName; // dept.dname
	private String deptLocal; // dept.loc
	private String empJob; // emp.job
	private int empSal; // emp.sal
	
	public Empinfo() { }
	
	public Empinfo(int empNo, String empName, String deptName, String deptLocal, String empJob, int empSal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.deptName = deptName;
		this.deptLocal = deptLocal;
		this.empJob = empJob;
		this.empSal = empSal;
	}

	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLocal() {
		return deptLocal;
	}
	public void setDeptLocal(String deptLocal) {
		this.deptLocal = deptLocal;
	}
	public String getEmpJob() {
		return empJob;
	}
	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	@Override
	public String toString() {
		return "Empinfo [empNo=" + empNo + ", empName=" + empName + ", deptName=" + deptName + ", deptLocal="
				+ deptLocal + ", empJob=" + empJob + ", empSal=" + empSal + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptLocal == null) ? 0 : deptLocal.hashCode());
		result = prime * result + ((deptName == null) ? 0 : deptName.hashCode());
		result = prime * result + ((empJob == null) ? 0 : empJob.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + empNo;
		result = prime * result + empSal;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empinfo other = (Empinfo) obj;
		if (deptLocal == null) {
			if (other.deptLocal != null)
				return false;
		} else if (!deptLocal.equals(other.deptLocal))
			return false;
		if (deptName == null) {
			if (other.deptName != null)
				return false;
		} else if (!deptName.equals(other.deptName))
			return false;
		if (empJob == null) {
			if (other.empJob != null)
				return false;
		} else if (!empJob.equals(other.empJob))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empNo != other.empNo)
			return false;
		if (empSal != other.empSal)
			return false;
		return true;
	}

}
```  
