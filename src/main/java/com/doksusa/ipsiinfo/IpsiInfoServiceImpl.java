package com.doksusa.ipsiinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("ipsiService")
public class IpsiInfoServiceImpl implements IpsiInfoService {

	@Autowired
	@Qualifier("ipsi")
	IpsiInfoDAO ipsi;
	
	@Override
	public List<IpsiInfoDAO> ipsi_selectAll() {
		return ipsi.ipsi_selectAll();
	}

	@Override
	public IpsiInfoDAO ipsi_select(String university) {
		return ipsi.ipsi_select(university);
	}

	@Override
	public List<IpsiInfoDAO> ipsi_selectByKey(String key) {
		return ipsi.ipsi_selectByKey(key);
	}

	@Override
	public int ipsi_insert(IpsiInfoDAO ipsidao) {
		return ipsi.ipsi_insert(ipsidao);
	}

	@Override
	public int ipsi_update(String university) {
		return ipsi.ipsi_update(university);
	}

	@Override
	public int ipsi_delete(String university) {
		return ipsi.ipsi_delete(university);
	}

}
