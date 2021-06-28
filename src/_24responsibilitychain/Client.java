package _24responsibilitychain;

public class Client {

	public static void main(String[] args) {
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);
		
		DepartmentApprover departmentApprover = new DepartmentApprover("老师");
		CollegeApprover collegeApprover = new CollegeApprover("主任");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校长");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");
	
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);
		
		departmentApprover.processRequest(purchaseRequest);
		viceSchoolMasterApprover.processRequest(purchaseRequest);
	}

}
