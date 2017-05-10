/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.edu.thu.tsfiledb.service.rpc.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-5-10")
public class TSFetchResultsResp implements org.apache.thrift.TBase<TSFetchResultsResp, TSFetchResultsResp._Fields>, java.io.Serializable, Cloneable, Comparable<TSFetchResultsResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSFetchResultsResp");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField HAS_RESULT_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("hasResultSet", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField QUERY_DATA_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("queryDataSet", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TSFetchResultsRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TSFetchResultsRespTupleSchemeFactory());
  }

  public TS_Status status; // required
  public boolean hasResultSet; // required
  public TSQueryDataSet queryDataSet; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    HAS_RESULT_SET((short)2, "hasResultSet"),
    QUERY_DATA_SET((short)3, "queryDataSet");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS
          return STATUS;
        case 2: // HAS_RESULT_SET
          return HAS_RESULT_SET;
        case 3: // QUERY_DATA_SET
          return QUERY_DATA_SET;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __HASRESULTSET_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.QUERY_DATA_SET};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TS_Status.class)));
    tmpMap.put(_Fields.HAS_RESULT_SET, new org.apache.thrift.meta_data.FieldMetaData("hasResultSet", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.QUERY_DATA_SET, new org.apache.thrift.meta_data.FieldMetaData("queryDataSet", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSQueryDataSet.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSFetchResultsResp.class, metaDataMap);
  }

  public TSFetchResultsResp() {
  }

  public TSFetchResultsResp(
    TS_Status status,
    boolean hasResultSet)
  {
    this();
    this.status = status;
    this.hasResultSet = hasResultSet;
    setHasResultSetIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSFetchResultsResp(TSFetchResultsResp other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new TS_Status(other.status);
    }
    this.hasResultSet = other.hasResultSet;
    if (other.isSetQueryDataSet()) {
      this.queryDataSet = new TSQueryDataSet(other.queryDataSet);
    }
  }

  public TSFetchResultsResp deepCopy() {
    return new TSFetchResultsResp(this);
  }

  @Override
  public void clear() {
    this.status = null;
    setHasResultSetIsSet(false);
    this.hasResultSet = false;
    this.queryDataSet = null;
  }

  public TS_Status getStatus() {
    return this.status;
  }

  public TSFetchResultsResp setStatus(TS_Status status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public boolean isHasResultSet() {
    return this.hasResultSet;
  }

  public TSFetchResultsResp setHasResultSet(boolean hasResultSet) {
    this.hasResultSet = hasResultSet;
    setHasResultSetIsSet(true);
    return this;
  }

  public void unsetHasResultSet() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HASRESULTSET_ISSET_ID);
  }

  /** Returns true if field hasResultSet is set (has been assigned a value) and false otherwise */
  public boolean isSetHasResultSet() {
    return EncodingUtils.testBit(__isset_bitfield, __HASRESULTSET_ISSET_ID);
  }

  public void setHasResultSetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HASRESULTSET_ISSET_ID, value);
  }

  public TSQueryDataSet getQueryDataSet() {
    return this.queryDataSet;
  }

  public TSFetchResultsResp setQueryDataSet(TSQueryDataSet queryDataSet) {
    this.queryDataSet = queryDataSet;
    return this;
  }

  public void unsetQueryDataSet() {
    this.queryDataSet = null;
  }

  /** Returns true if field queryDataSet is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryDataSet() {
    return this.queryDataSet != null;
  }

  public void setQueryDataSetIsSet(boolean value) {
    if (!value) {
      this.queryDataSet = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((TS_Status)value);
      }
      break;

    case HAS_RESULT_SET:
      if (value == null) {
        unsetHasResultSet();
      } else {
        setHasResultSet((Boolean)value);
      }
      break;

    case QUERY_DATA_SET:
      if (value == null) {
        unsetQueryDataSet();
      } else {
        setQueryDataSet((TSQueryDataSet)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case HAS_RESULT_SET:
      return Boolean.valueOf(isHasResultSet());

    case QUERY_DATA_SET:
      return getQueryDataSet();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case HAS_RESULT_SET:
      return isSetHasResultSet();
    case QUERY_DATA_SET:
      return isSetQueryDataSet();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TSFetchResultsResp)
      return this.equals((TSFetchResultsResp)that);
    return false;
  }

  public boolean equals(TSFetchResultsResp that) {
    if (that == null)
      return false;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_hasResultSet = true;
    boolean that_present_hasResultSet = true;
    if (this_present_hasResultSet || that_present_hasResultSet) {
      if (!(this_present_hasResultSet && that_present_hasResultSet))
        return false;
      if (this.hasResultSet != that.hasResultSet)
        return false;
    }

    boolean this_present_queryDataSet = true && this.isSetQueryDataSet();
    boolean that_present_queryDataSet = true && that.isSetQueryDataSet();
    if (this_present_queryDataSet || that_present_queryDataSet) {
      if (!(this_present_queryDataSet && that_present_queryDataSet))
        return false;
      if (!this.queryDataSet.equals(that.queryDataSet))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status);

    boolean present_hasResultSet = true;
    list.add(present_hasResultSet);
    if (present_hasResultSet)
      list.add(hasResultSet);

    boolean present_queryDataSet = true && (isSetQueryDataSet());
    list.add(present_queryDataSet);
    if (present_queryDataSet)
      list.add(queryDataSet);

    return list.hashCode();
  }

  @Override
  public int compareTo(TSFetchResultsResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHasResultSet()).compareTo(other.isSetHasResultSet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasResultSet()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hasResultSet, other.hasResultSet);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueryDataSet()).compareTo(other.isSetQueryDataSet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryDataSet()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryDataSet, other.queryDataSet);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TSFetchResultsResp(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hasResultSet:");
    sb.append(this.hasResultSet);
    first = false;
    if (isSetQueryDataSet()) {
      if (!first) sb.append(", ");
      sb.append("queryDataSet:");
      if (this.queryDataSet == null) {
        sb.append("null");
      } else {
        sb.append(this.queryDataSet);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (status == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'hasResultSet' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
    if (queryDataSet != null) {
      queryDataSet.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TSFetchResultsRespStandardSchemeFactory implements SchemeFactory {
    public TSFetchResultsRespStandardScheme getScheme() {
      return new TSFetchResultsRespStandardScheme();
    }
  }

  private static class TSFetchResultsRespStandardScheme extends StandardScheme<TSFetchResultsResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSFetchResultsResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new TS_Status();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HAS_RESULT_SET
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.hasResultSet = iprot.readBool();
              struct.setHasResultSetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // QUERY_DATA_SET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.queryDataSet = new TSQueryDataSet();
              struct.queryDataSet.read(iprot);
              struct.setQueryDataSetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetHasResultSet()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'hasResultSet' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSFetchResultsResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(HAS_RESULT_SET_FIELD_DESC);
      oprot.writeBool(struct.hasResultSet);
      oprot.writeFieldEnd();
      if (struct.queryDataSet != null) {
        if (struct.isSetQueryDataSet()) {
          oprot.writeFieldBegin(QUERY_DATA_SET_FIELD_DESC);
          struct.queryDataSet.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSFetchResultsRespTupleSchemeFactory implements SchemeFactory {
    public TSFetchResultsRespTupleScheme getScheme() {
      return new TSFetchResultsRespTupleScheme();
    }
  }

  private static class TSFetchResultsRespTupleScheme extends TupleScheme<TSFetchResultsResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSFetchResultsResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.status.write(oprot);
      oprot.writeBool(struct.hasResultSet);
      BitSet optionals = new BitSet();
      if (struct.isSetQueryDataSet()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetQueryDataSet()) {
        struct.queryDataSet.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSFetchResultsResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.status = new TS_Status();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      struct.hasResultSet = iprot.readBool();
      struct.setHasResultSetIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.queryDataSet = new TSQueryDataSet();
        struct.queryDataSet.read(iprot);
        struct.setQueryDataSetIsSet(true);
      }
    }
  }

}

