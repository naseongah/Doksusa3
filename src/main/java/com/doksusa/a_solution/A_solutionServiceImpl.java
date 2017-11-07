package com.doksusa.a_solution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("asService")
public class A_solutionServiceImpl implements A_solutionService {

	@Autowired
	@Qualifier("as")
	A_solutionDAO as;
	
	@Override
	public A_solutionDAO as_select(int a_num) {
		return as.as_select(a_num);
	}

	@Override
	public int as_insert(A_solutionDAO asdao) {
		return as.as_insert(asdao);
	}

	@Override
	public int as_update(int a_num) {
		return as.as_update(a_num);
	}

	@Override
	public int as_delete(int a_num) {
		return as.as_delete(a_num);
	}

}
