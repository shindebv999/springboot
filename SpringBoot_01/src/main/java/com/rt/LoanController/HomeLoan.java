package com.rt.LoanController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rt.LoanEntity.HomeLoanEntity;

@RestController
public class HomeLoan {

	@GetMapping("/HomeLoanInfo")
	public HomeLoanEntity HomeLoanInfo() {
		HomeLoanEntity hLoan = new HomeLoanEntity(101, 101 * 200, 27, 101 * 500, "Salaried", 2, "Permenant Resident",
				"Land/Ploat");
		System.out.println("Get HomeLoanInfo");
		return hLoan;
	}

	@PostMapping("/HomeLoanInfo")
	public HomeLoanEntity HomeLoan_Info(@RequestBody HomeLoanEntity hLoan) {
		System.out.println(hLoan.getEmp_id() + "  " + hLoan.getIncome() + "  " + hLoan.getAge() + "  "
				+ hLoan.getLoanAmount() + "  " + hLoan.getEmpStatus() + "  " + hLoan.getWorkExperiance() + "  "
				+ hLoan.getResidentType() + "  " + hLoan.getPropertyType());
		System.out.println("Post HomeLoanInfo");
		return hLoan;
	}

	@RequestMapping("/homeLoan/{emp_id}")
	public HomeLoanEntity HLoan(@PathVariable("emp_id") int eid) {
		HomeLoanEntity hLoan = new HomeLoanEntity(eid, eid * 200, 27, eid * 500, "Salaried", 2, "Permenant Resident",
				"Land/Ploat");
		return hLoan;
	}

	@GetMapping("/homeLoan/info")
	public HomeLoanEntity H_Loan(@RequestParam("emp_id") int eid) {
		HomeLoanEntity hLoan = new HomeLoanEntity(eid, eid * 200, 27, eid * 500, "Salaried", 2, "Permenant Resident",
				"Land/Ploat");
		return hLoan;
	}

}
