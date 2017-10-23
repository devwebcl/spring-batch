package cl.devweb.model.citydeal;

import java.util.Date;


public class DealLimitGroup {


     private int dlg_id;
     private int dlg_limit_for_user;
     private boolean dlg_active;
     private Date dlg_created;
     private Date dlg_last_modified;


	public int getDlg_id() {
		return dlg_id;
	}
	public void setDlg_id(int dlg_id) {
		this.dlg_id = dlg_id;
	}
	public int getDlg_limit_for_user() {
		return dlg_limit_for_user;
	}
	public void setDlg_limit_for_user(int dlg_limit_for_user) {
		this.dlg_limit_for_user = dlg_limit_for_user;
	}
	public boolean isDlg_active() {
		return dlg_active;
	}
	public void setDlg_active(boolean dlg_active) {
		this.dlg_active = dlg_active;
	}
	public Date getDlg_created() {
		return dlg_created;
	}
	public void setDlg_created(Date dlg_created) {
		this.dlg_created = dlg_created;
	}
	public Date getDlg_last_modified() {
		return dlg_last_modified;
	}
	public void setDlg_last_modified(Date dlg_last_modified) {
		this.dlg_last_modified = dlg_last_modified;
	}




}


