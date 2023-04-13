package kodlama.io.starbucks.business.abstracts;

import kodlama.io.starbucks.business.dto.create.CreateCustomerRequest;
import kodlama.io.starbucks.business.dto.update.CreateCustomerResponse;

public interface CustomerService {

    public CreateCustomerResponse save(CreateCustomerRequest request);

}













