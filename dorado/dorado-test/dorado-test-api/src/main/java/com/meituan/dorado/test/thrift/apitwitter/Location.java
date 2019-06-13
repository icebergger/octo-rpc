/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.meituan.dorado.test.thrift.apitwitter;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-06-13")
public class Location implements org.apache.thrift.TBase<Location, Location._Fields>, java.io.Serializable, Cloneable, Comparable<Location> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Location");

  private static final org.apache.thrift.protocol.TField LATITUDE_FIELD_DESC = new org.apache.thrift.protocol.TField("latitude", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField LONGITUDE_FIELD_DESC = new org.apache.thrift.protocol.TField("longitude", org.apache.thrift.protocol.TType.DOUBLE, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new LocationStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new LocationTupleSchemeFactory();

  public double latitude; // required
  public double longitude; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LATITUDE((short)1, "latitude"),
    LONGITUDE((short)2, "longitude");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LATITUDE
          return LATITUDE;
        case 2: // LONGITUDE
          return LONGITUDE;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LATITUDE_ISSET_ID = 0;
  private static final int __LONGITUDE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LATITUDE, new org.apache.thrift.meta_data.FieldMetaData("latitude", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.LONGITUDE, new org.apache.thrift.meta_data.FieldMetaData("longitude", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Location.class, metaDataMap);
  }

  public Location() {
  }

  public Location(
    double latitude,
    double longitude)
  {
    this();
    this.latitude = latitude;
    setLatitudeIsSet(true);
    this.longitude = longitude;
    setLongitudeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Location(Location other) {
    __isset_bitfield = other.__isset_bitfield;
    this.latitude = other.latitude;
    this.longitude = other.longitude;
  }

  public Location deepCopy() {
    return new Location(this);
  }

  @Override
  public void clear() {
    setLatitudeIsSet(false);
    this.latitude = 0.0;
    setLongitudeIsSet(false);
    this.longitude = 0.0;
  }

  public double getLatitude() {
    return this.latitude;
  }

  public Location setLatitude(double latitude) {
    this.latitude = latitude;
    setLatitudeIsSet(true);
    return this;
  }

  public void unsetLatitude() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LATITUDE_ISSET_ID);
  }

  /** Returns true if field latitude is set (has been assigned a value) and false otherwise */
  public boolean isSetLatitude() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LATITUDE_ISSET_ID);
  }

  public void setLatitudeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LATITUDE_ISSET_ID, value);
  }

  public double getLongitude() {
    return this.longitude;
  }

  public Location setLongitude(double longitude) {
    this.longitude = longitude;
    setLongitudeIsSet(true);
    return this;
  }

  public void unsetLongitude() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LONGITUDE_ISSET_ID);
  }

  /** Returns true if field longitude is set (has been assigned a value) and false otherwise */
  public boolean isSetLongitude() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LONGITUDE_ISSET_ID);
  }

  public void setLongitudeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LONGITUDE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case LATITUDE:
      if (value == null) {
        unsetLatitude();
      } else {
        setLatitude((java.lang.Double)value);
      }
      break;

    case LONGITUDE:
      if (value == null) {
        unsetLongitude();
      } else {
        setLongitude((java.lang.Double)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LATITUDE:
      return getLatitude();

    case LONGITUDE:
      return getLongitude();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case LATITUDE:
      return isSetLatitude();
    case LONGITUDE:
      return isSetLongitude();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Location)
      return this.equals((Location)that);
    return false;
  }

  public boolean equals(Location that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_latitude = true;
    boolean that_present_latitude = true;
    if (this_present_latitude || that_present_latitude) {
      if (!(this_present_latitude && that_present_latitude))
        return false;
      if (this.latitude != that.latitude)
        return false;
    }

    boolean this_present_longitude = true;
    boolean that_present_longitude = true;
    if (this_present_longitude || that_present_longitude) {
      if (!(this_present_longitude && that_present_longitude))
        return false;
      if (this.longitude != that.longitude)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(latitude);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(longitude);

    return hashCode;
  }

  @Override
  public int compareTo(Location other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetLatitude()).compareTo(other.isSetLatitude());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLatitude()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.latitude, other.latitude);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLongitude()).compareTo(other.isSetLongitude());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLongitude()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.longitude, other.longitude);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Location(");
    boolean first = true;

    sb.append("latitude:");
    sb.append(this.latitude);
    first = false;
    if (!first) sb.append(", ");
    sb.append("longitude:");
    sb.append(this.longitude);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'latitude' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'longitude' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LocationStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LocationStandardScheme getScheme() {
      return new LocationStandardScheme();
    }
  }

  private static class LocationStandardScheme extends org.apache.thrift.scheme.StandardScheme<Location> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Location struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LATITUDE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.latitude = iprot.readDouble();
              struct.setLatitudeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LONGITUDE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.longitude = iprot.readDouble();
              struct.setLongitudeIsSet(true);
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
      if (!struct.isSetLatitude()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'latitude' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetLongitude()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'longitude' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Location struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LATITUDE_FIELD_DESC);
      oprot.writeDouble(struct.latitude);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LONGITUDE_FIELD_DESC);
      oprot.writeDouble(struct.longitude);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LocationTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LocationTupleScheme getScheme() {
      return new LocationTupleScheme();
    }
  }

  private static class LocationTupleScheme extends org.apache.thrift.scheme.TupleScheme<Location> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Location struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeDouble(struct.latitude);
      oprot.writeDouble(struct.longitude);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Location struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.latitude = iprot.readDouble();
      struct.setLatitudeIsSet(true);
      struct.longitude = iprot.readDouble();
      struct.setLongitudeIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

