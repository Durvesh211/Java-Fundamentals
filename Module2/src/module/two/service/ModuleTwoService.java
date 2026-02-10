package module.two.service;
import module.one.service.ModuleOneService;
//import module.one.util.ModuleOneUtil;  TO ACCESS MODULEONEUTIL
public class ModuleTwoService {
	
	 static ModuleOneService modOneServ = new ModuleOneService();
	
	public static void main(String[] args) {
		modOneServ.externalAccessible("Module Two Service");
	}
}