/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_ARRAYS", schema = "TEST")
public class TArraysRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord> {

	private static final long serialVersionUID = -360874204;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setStringArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.STRING_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "STRING_ARRAY", length = 101)
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord getStringArray() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.STRING_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setNumberArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.NUMBER_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "NUMBER_ARRAY", length = 109)
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord getNumberArray() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.NUMBER_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setNumberLongArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.NUMBER_LONG_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "NUMBER_LONG_ARRAY", length = 109)
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord getNumberLongArray() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.NUMBER_LONG_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setDateArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.DATE_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "DATE_ARRAY", length = 49)
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord getDateArray() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.DATE_ARRAY);
	}

	/**
	 * Create a detached TArraysRecord
	 */
	public TArraysRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS);
	}
}
