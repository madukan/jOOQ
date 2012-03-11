/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductInventory", schema = "Production", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ProductID", "LocationID"})
})
public class ProductInventory extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory> {

	private static final long serialVersionUID = 1419459639;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductInventory_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory.ProductID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductInventory_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory.ProductID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductInventory_Location_LocationID
	 * FOREIGN KEY (LocationID)
	 * REFERENCES Production.Location (LocationID)
	 * </pre></code>
	 */
	public void setLocationID(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory.LocationID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductInventory_Location_LocationID
	 * FOREIGN KEY (LocationID)
	 * REFERENCES Production.Location (LocationID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "LocationID", nullable = false, precision = 5)
	public java.lang.Short getLocationID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory.LocationID);
	}

	/**
	 * An uncommented item
	 */
	public void setShelf(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory.Shelf, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Shelf", nullable = false, length = 10)
	public java.lang.String getShelf() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory.Shelf);
	}

	/**
	 * An uncommented item
	 */
	public void setBin(java.lang.Byte value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory.Bin, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Bin", nullable = false, precision = 3)
	public java.lang.Byte getBin() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory.Bin);
	}

	/**
	 * An uncommented item
	 */
	public void setQuantity(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory.Quantity, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Quantity", nullable = false, precision = 5)
	public java.lang.Short getQuantity() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory.Quantity);
	}

	/**
	 * An uncommented item
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory.rowguid, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory.rowguid);
	}

	/**
	 * An uncommented item
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory.ModifiedDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory.ModifiedDate);
	}

	/**
	 * Create a detached ProductInventory
	 */
	public ProductInventory() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory);
	}
}
