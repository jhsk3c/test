package Service.ComManagement;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.Admin.AdminRepository;


@Service
public class ActivityDeleteStoreService {

	@Autowired
	private AdminRepository adminRepository;

	
	public Integer deleteStore(String stNum) {
		Integer Num = Integer.parseInt(stNum);
		
	return adminRepository.deleteStore(Num);
	}

}
