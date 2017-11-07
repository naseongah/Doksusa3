package com.doksusa.dao;

import java.util.List;

public interface IpsiInfoDAO {
	
	public List<IpsiInfoDAO> ipsi_selectAll();
	
	public IpsiInfoDAO ipsi_select(String university);
	
	public List<IpsiInfoDAO> ipsi_selectByKey(String key);
	
	public int ipsi_insert(IpsiInfoDAO ipsidao);
	
	public int ipsi_update(String university);
	
	public int ipsi_delete(String university);
	
}
