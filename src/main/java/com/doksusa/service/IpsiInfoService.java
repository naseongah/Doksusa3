package com.doksusa.service;

import java.util.List;

import com.doksusa.dao.IpsiInfoDAO;

public interface IpsiInfoService {

	public List<IpsiInfoDAO> ipsi_selectAll();

	public IpsiInfoDAO ipsi_select(String university);

	public List<IpsiInfoDAO> ipsi_selectByKey(String key);

	public int ipsi_insert(IpsiInfoDAO ipsidao);

	public int ipsi_update(String university);

	public int ipsi_delete(String university);

}
