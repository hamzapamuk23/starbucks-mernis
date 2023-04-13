package kodlama.io.starbucks.business.concretes;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import kodlama.io.starbucks.business.abstracts.CustomerService;
import kodlama.io.starbucks.business.dto.create.CreateCustomerRequest;
import kodlama.io.starbucks.business.dto.update.CreateCustomerResponse;
import kodlama.io.starbucks.entities.Customer;
import kodlama.io.starbucks.repository.CustomerRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerManager implements CustomerService {

    private CustomerRepository customerRepository;

    private ModelMapper mapper;

    @Override
    public CreateCustomerResponse save(CreateCustomerRequest request) {
        ///////
        Customer customer = mapper.map(request, Customer.class);
        customerRepository.save(customer);
        return mapper.map(customer, CreateCustomerResponse.class);
    }
    
}
