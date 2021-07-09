package _24responsibilitychain;

/**
 * @author jehon
 *
 * 责任链模式
 */
public class Client {

	public static void main(String[] args) {
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);
		
		DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
		CollegeApprover collegeApprover = new CollegeApprover("李院长");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校长");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校长");
	
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);
		
		departmentApprover.processRequest(purchaseRequest);
		viceSchoolMasterApprover.processRequest(purchaseRequest);
	}
}
