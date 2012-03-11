/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vProductModelInstructions", schema = "Production")
public class vProductModelInstructions extends org.jooq.impl.TableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.vProductModelInstructions> {

	private static final long serialVersionUID = 1812521227;

	/**
	 * An uncommented item
	 */
	public void setProductModelID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.ProductModelID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ProductModelID", nullable = false, precision = 10)
	public java.lang.Integer getProductModelID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.ProductModelID);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.Name, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.Name);
	}

	/**
	 * An uncommented item
	 */
	public void setInstructions(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.Instructions, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Instructions")
	public java.lang.String getInstructions() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.Instructions);
	}

	/**
	 * An uncommented item
	 */
	public void setLocationID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.LocationID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LocationID", precision = 10)
	public java.lang.Integer getLocationID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.LocationID);
	}

	/**
	 * An uncommented item
	 */
	public void setSetupHours(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.SetupHours, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "SetupHours", precision = 9, scale = 4)
	public java.math.BigDecimal getSetupHours() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.SetupHours);
	}

	/**
	 * An uncommented item
	 */
	public void setMachineHours(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.MachineHours, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "MachineHours", precision = 9, scale = 4)
	public java.math.BigDecimal getMachineHours() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.MachineHours);
	}

	/**
	 * An uncommented item
	 */
	public void setLaborHours(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.LaborHours, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LaborHours", precision = 9, scale = 4)
	public java.math.BigDecimal getLaborHours() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.LaborHours);
	}

	/**
	 * An uncommented item
	 */
	public void setLotSize(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.LotSize, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LotSize", precision = 10)
	public java.lang.Integer getLotSize() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.LotSize);
	}

	/**
	 * An uncommented item
	 */
	public void setStep(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.Step, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Step", length = 1024)
	public java.lang.String getStep() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.Step);
	}

	/**
	 * An uncommented item
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.rowguid, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.rowguid);
	}

	/**
	 * An uncommented item
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.ModifiedDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions.ModifiedDate);
	}

	/**
	 * Create a detached vProductModelInstructions
	 */
	public vProductModelInstructions() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions);
	}
}
