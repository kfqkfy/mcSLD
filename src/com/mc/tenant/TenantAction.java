/**
 * 
 */
package com.mc.tenant;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.json.annotations.JSON;

import com.mc.pojo.BTenant;
import com.mc.service.IService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author kongfeiquan
 *
 */
public class TenantAction extends ActionSupport {

	private IService service ;
	private List<BTenant> root; 
	private BTenant tenant;
    
    public List<BTenant> getRoot() { 
        return root; 
    } 
    
    public void setRoot(List<BTenant> root) { 
        this.root = root; 
    } 
    
    
    
    
	public BTenant getTenant() {
		return tenant;
	}

	public void setTenant(BTenant tenant) {
		this.tenant = tenant;
	}

	/**
	 * 
	 */
	public TenantAction() {
		// TODO Auto-generated constructor stub
		
	}

	public String getAllTenant(){
		root = new ArrayList<BTenant>();
		root = service.getAllTenant();
		tenant = root.get(0);
		return "success";
	}
	
	@JSON(serialize=false)
	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}

}
