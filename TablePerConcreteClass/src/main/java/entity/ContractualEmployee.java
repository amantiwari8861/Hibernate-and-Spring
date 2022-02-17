package entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id")),
		@AttributeOverride(name = "name", column = @Column(name = "name")) })
public class ContractualEmployee extends Employee {

	@Column(name = "hourly_rate")
	private Double HourlyRate;

	@Column(name = "contract_period")
	private Float ContractPeriod;

	public ContractualEmployee(long id, String name, Double hourlyRate, Float contractPeriod) {
		super(id, name);
		HourlyRate = hourlyRate;
		ContractPeriod = contractPeriod;
	}

	public Double getHourlyRate() {
		return HourlyRate;
	}

	public void setHourlyRate(Double hourlyRate) {
		HourlyRate = hourlyRate;
	}

	public Float getContractPeriod() {
		return ContractPeriod;
	}

	public void setContractPeriod(Float contractPeriod) {
		ContractPeriod = contractPeriod;
	}

}