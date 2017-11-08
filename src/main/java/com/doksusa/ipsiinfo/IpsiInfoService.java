package com.doksusa.ipsiinfo;

import java.util.List;

public interface IpsiInfoService {

public List<IpsiInfoDTO> ipsi_selectAll();
	
	public IpsiInfoDTO ipsi_select(String university);
	
	public List<IpsiInfoDTO> ipsi_selectByKey(String key);
	
	public int ipsi_insert(IpsiInfoDTO ipsidto);
	
	public int ipsi_update(String university);
	
	public int ipsi_delete(String university);

}
