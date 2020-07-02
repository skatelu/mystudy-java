package com.example.changedata.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SclZhrmghgcjrzAllExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SclZhrmghgcjrzAllExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCertificatenameIsNull() {
            addCriterion("CertificateName is null");
            return (Criteria) this;
        }

        public Criteria andCertificatenameIsNotNull() {
            addCriterion("CertificateName is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatenameEqualTo(String value) {
            addCriterion("CertificateName =", value, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameNotEqualTo(String value) {
            addCriterion("CertificateName <>", value, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameGreaterThan(String value) {
            addCriterion("CertificateName >", value, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameGreaterThanOrEqualTo(String value) {
            addCriterion("CertificateName >=", value, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameLessThan(String value) {
            addCriterion("CertificateName <", value, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameLessThanOrEqualTo(String value) {
            addCriterion("CertificateName <=", value, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameLike(String value) {
            addCriterion("CertificateName like", value, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameNotLike(String value) {
            addCriterion("CertificateName not like", value, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameIn(List<String> values) {
            addCriterion("CertificateName in", values, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameNotIn(List<String> values) {
            addCriterion("CertificateName not in", values, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameBetween(String value1, String value2) {
            addCriterion("CertificateName between", value1, value2, "certificatename");
            return (Criteria) this;
        }

        public Criteria andCertificatenameNotBetween(String value1, String value2) {
            addCriterion("CertificateName not between", value1, value2, "certificatename");
            return (Criteria) this;
        }

        public Criteria andIssuedeptIsNull() {
            addCriterion("IssueDept is null");
            return (Criteria) this;
        }

        public Criteria andIssuedeptIsNotNull() {
            addCriterion("IssueDept is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedeptEqualTo(String value) {
            addCriterion("IssueDept =", value, "issuedept");
            return (Criteria) this;
        }

        public Criteria andIssuedeptNotEqualTo(String value) {
            addCriterion("IssueDept <>", value, "issuedept");
            return (Criteria) this;
        }

        public Criteria andIssuedeptGreaterThan(String value) {
            addCriterion("IssueDept >", value, "issuedept");
            return (Criteria) this;
        }

        public Criteria andIssuedeptGreaterThanOrEqualTo(String value) {
            addCriterion("IssueDept >=", value, "issuedept");
            return (Criteria) this;
        }

        public Criteria andIssuedeptLessThan(String value) {
            addCriterion("IssueDept <", value, "issuedept");
            return (Criteria) this;
        }

        public Criteria andIssuedeptLessThanOrEqualTo(String value) {
            addCriterion("IssueDept <=", value, "issuedept");
            return (Criteria) this;
        }

        public Criteria andIssuedeptLike(String value) {
            addCriterion("IssueDept like", value, "issuedept");
            return (Criteria) this;
        }

        public Criteria andIssuedeptNotLike(String value) {
            addCriterion("IssueDept not like", value, "issuedept");
            return (Criteria) this;
        }

        public Criteria andIssuedeptIn(List<String> values) {
            addCriterion("IssueDept in", values, "issuedept");
            return (Criteria) this;
        }

        public Criteria andIssuedeptNotIn(List<String> values) {
            addCriterion("IssueDept not in", values, "issuedept");
            return (Criteria) this;
        }

        public Criteria andIssuedeptBetween(String value1, String value2) {
            addCriterion("IssueDept between", value1, value2, "issuedept");
            return (Criteria) this;
        }

        public Criteria andIssuedeptNotBetween(String value1, String value2) {
            addCriterion("IssueDept not between", value1, value2, "issuedept");
            return (Criteria) this;
        }

        public Criteria andCertificateholdertypeIsNull() {
            addCriterion("CertificateHolderType is null");
            return (Criteria) this;
        }

        public Criteria andCertificateholdertypeIsNotNull() {
            addCriterion("CertificateHolderType is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateholdertypeEqualTo(String value) {
            addCriterion("CertificateHolderType =", value, "certificateholdertype");
            return (Criteria) this;
        }

        public Criteria andCertificateholdertypeNotEqualTo(String value) {
            addCriterion("CertificateHolderType <>", value, "certificateholdertype");
            return (Criteria) this;
        }

        public Criteria andCertificateholdertypeGreaterThan(String value) {
            addCriterion("CertificateHolderType >", value, "certificateholdertype");
            return (Criteria) this;
        }

        public Criteria andCertificateholdertypeGreaterThanOrEqualTo(String value) {
            addCriterion("CertificateHolderType >=", value, "certificateholdertype");
            return (Criteria) this;
        }

        public Criteria andCertificateholdertypeLessThan(String value) {
            addCriterion("CertificateHolderType <", value, "certificateholdertype");
            return (Criteria) this;
        }

        public Criteria andCertificateholdertypeLessThanOrEqualTo(String value) {
            addCriterion("CertificateHolderType <=", value, "certificateholdertype");
            return (Criteria) this;
        }

        public Criteria andCertificateholdertypeLike(String value) {
            addCriterion("CertificateHolderType like", value, "certificateholdertype");
            return (Criteria) this;
        }

        public Criteria andCertificateholdertypeNotLike(String value) {
            addCriterion("CertificateHolderType not like", value, "certificateholdertype");
            return (Criteria) this;
        }

        public Criteria andCertificateholdertypeIn(List<String> values) {
            addCriterion("CertificateHolderType in", values, "certificateholdertype");
            return (Criteria) this;
        }

        public Criteria andCertificateholdertypeNotIn(List<String> values) {
            addCriterion("CertificateHolderType not in", values, "certificateholdertype");
            return (Criteria) this;
        }

        public Criteria andCertificateholdertypeBetween(String value1, String value2) {
            addCriterion("CertificateHolderType between", value1, value2, "certificateholdertype");
            return (Criteria) this;
        }

        public Criteria andCertificateholdertypeNotBetween(String value1, String value2) {
            addCriterion("CertificateHolderType not between", value1, value2, "certificateholdertype");
            return (Criteria) this;
        }

        public Criteria andCertificateholderIsNull() {
            addCriterion("CertificateHolder is null");
            return (Criteria) this;
        }

        public Criteria andCertificateholderIsNotNull() {
            addCriterion("CertificateHolder is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateholderEqualTo(String value) {
            addCriterion("CertificateHolder =", value, "certificateholder");
            return (Criteria) this;
        }

        public Criteria andCertificateholderNotEqualTo(String value) {
            addCriterion("CertificateHolder <>", value, "certificateholder");
            return (Criteria) this;
        }

        public Criteria andCertificateholderGreaterThan(String value) {
            addCriterion("CertificateHolder >", value, "certificateholder");
            return (Criteria) this;
        }

        public Criteria andCertificateholderGreaterThanOrEqualTo(String value) {
            addCriterion("CertificateHolder >=", value, "certificateholder");
            return (Criteria) this;
        }

        public Criteria andCertificateholderLessThan(String value) {
            addCriterion("CertificateHolder <", value, "certificateholder");
            return (Criteria) this;
        }

        public Criteria andCertificateholderLessThanOrEqualTo(String value) {
            addCriterion("CertificateHolder <=", value, "certificateholder");
            return (Criteria) this;
        }

        public Criteria andCertificateholderLike(String value) {
            addCriterion("CertificateHolder like", value, "certificateholder");
            return (Criteria) this;
        }

        public Criteria andCertificateholderNotLike(String value) {
            addCriterion("CertificateHolder not like", value, "certificateholder");
            return (Criteria) this;
        }

        public Criteria andCertificateholderIn(List<String> values) {
            addCriterion("CertificateHolder in", values, "certificateholder");
            return (Criteria) this;
        }

        public Criteria andCertificateholderNotIn(List<String> values) {
            addCriterion("CertificateHolder not in", values, "certificateholder");
            return (Criteria) this;
        }

        public Criteria andCertificateholderBetween(String value1, String value2) {
            addCriterion("CertificateHolder between", value1, value2, "certificateholder");
            return (Criteria) this;
        }

        public Criteria andCertificateholderNotBetween(String value1, String value2) {
            addCriterion("CertificateHolder not between", value1, value2, "certificateholder");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNull() {
            addCriterion("CertificateType is null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNotNull() {
            addCriterion("CertificateType is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeEqualTo(String value) {
            addCriterion("CertificateType =", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotEqualTo(String value) {
            addCriterion("CertificateType <>", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThan(String value) {
            addCriterion("CertificateType >", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CertificateType >=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThan(String value) {
            addCriterion("CertificateType <", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThanOrEqualTo(String value) {
            addCriterion("CertificateType <=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLike(String value) {
            addCriterion("CertificateType like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotLike(String value) {
            addCriterion("CertificateType not like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIn(List<String> values) {
            addCriterion("CertificateType in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotIn(List<String> values) {
            addCriterion("CertificateType not in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeBetween(String value1, String value2) {
            addCriterion("CertificateType between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotBetween(String value1, String value2) {
            addCriterion("CertificateType not between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificateholdercodeIsNull() {
            addCriterion("CertificateHolderCode is null");
            return (Criteria) this;
        }

        public Criteria andCertificateholdercodeIsNotNull() {
            addCriterion("CertificateHolderCode is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateholdercodeEqualTo(String value) {
            addCriterion("CertificateHolderCode =", value, "certificateholdercode");
            return (Criteria) this;
        }

        public Criteria andCertificateholdercodeNotEqualTo(String value) {
            addCriterion("CertificateHolderCode <>", value, "certificateholdercode");
            return (Criteria) this;
        }

        public Criteria andCertificateholdercodeGreaterThan(String value) {
            addCriterion("CertificateHolderCode >", value, "certificateholdercode");
            return (Criteria) this;
        }

        public Criteria andCertificateholdercodeGreaterThanOrEqualTo(String value) {
            addCriterion("CertificateHolderCode >=", value, "certificateholdercode");
            return (Criteria) this;
        }

        public Criteria andCertificateholdercodeLessThan(String value) {
            addCriterion("CertificateHolderCode <", value, "certificateholdercode");
            return (Criteria) this;
        }

        public Criteria andCertificateholdercodeLessThanOrEqualTo(String value) {
            addCriterion("CertificateHolderCode <=", value, "certificateholdercode");
            return (Criteria) this;
        }

        public Criteria andCertificateholdercodeLike(String value) {
            addCriterion("CertificateHolderCode like", value, "certificateholdercode");
            return (Criteria) this;
        }

        public Criteria andCertificateholdercodeNotLike(String value) {
            addCriterion("CertificateHolderCode not like", value, "certificateholdercode");
            return (Criteria) this;
        }

        public Criteria andCertificateholdercodeIn(List<String> values) {
            addCriterion("CertificateHolderCode in", values, "certificateholdercode");
            return (Criteria) this;
        }

        public Criteria andCertificateholdercodeNotIn(List<String> values) {
            addCriterion("CertificateHolderCode not in", values, "certificateholdercode");
            return (Criteria) this;
        }

        public Criteria andCertificateholdercodeBetween(String value1, String value2) {
            addCriterion("CertificateHolderCode between", value1, value2, "certificateholdercode");
            return (Criteria) this;
        }

        public Criteria andCertificateholdercodeNotBetween(String value1, String value2) {
            addCriterion("CertificateHolderCode not between", value1, value2, "certificateholdercode");
            return (Criteria) this;
        }

        public Criteria andCertificatelevelIsNull() {
            addCriterion("CertificateLevel is null");
            return (Criteria) this;
        }

        public Criteria andCertificatelevelIsNotNull() {
            addCriterion("CertificateLevel is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatelevelEqualTo(String value) {
            addCriterion("CertificateLevel =", value, "certificatelevel");
            return (Criteria) this;
        }

        public Criteria andCertificatelevelNotEqualTo(String value) {
            addCriterion("CertificateLevel <>", value, "certificatelevel");
            return (Criteria) this;
        }

        public Criteria andCertificatelevelGreaterThan(String value) {
            addCriterion("CertificateLevel >", value, "certificatelevel");
            return (Criteria) this;
        }

        public Criteria andCertificatelevelGreaterThanOrEqualTo(String value) {
            addCriterion("CertificateLevel >=", value, "certificatelevel");
            return (Criteria) this;
        }

        public Criteria andCertificatelevelLessThan(String value) {
            addCriterion("CertificateLevel <", value, "certificatelevel");
            return (Criteria) this;
        }

        public Criteria andCertificatelevelLessThanOrEqualTo(String value) {
            addCriterion("CertificateLevel <=", value, "certificatelevel");
            return (Criteria) this;
        }

        public Criteria andCertificatelevelLike(String value) {
            addCriterion("CertificateLevel like", value, "certificatelevel");
            return (Criteria) this;
        }

        public Criteria andCertificatelevelNotLike(String value) {
            addCriterion("CertificateLevel not like", value, "certificatelevel");
            return (Criteria) this;
        }

        public Criteria andCertificatelevelIn(List<String> values) {
            addCriterion("CertificateLevel in", values, "certificatelevel");
            return (Criteria) this;
        }

        public Criteria andCertificatelevelNotIn(List<String> values) {
            addCriterion("CertificateLevel not in", values, "certificatelevel");
            return (Criteria) this;
        }

        public Criteria andCertificatelevelBetween(String value1, String value2) {
            addCriterion("CertificateLevel between", value1, value2, "certificatelevel");
            return (Criteria) this;
        }

        public Criteria andCertificatelevelNotBetween(String value1, String value2) {
            addCriterion("CertificateLevel not between", value1, value2, "certificatelevel");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("Tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("Tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("Tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("Tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("Tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("Tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("Tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("Tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("Tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("Tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("Tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("Tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("Tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("Tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("Project is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("Project is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(String value) {
            addCriterion("Project =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(String value) {
            addCriterion("Project <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(String value) {
            addCriterion("Project >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(String value) {
            addCriterion("Project >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(String value) {
            addCriterion("Project <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(String value) {
            addCriterion("Project <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLike(String value) {
            addCriterion("Project like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotLike(String value) {
            addCriterion("Project not like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<String> values) {
            addCriterion("Project in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<String> values) {
            addCriterion("Project not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(String value1, String value2) {
            addCriterion("Project between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(String value1, String value2) {
            addCriterion("Project not between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andCitizenIdIsNull() {
            addCriterion("Citizen_id is null");
            return (Criteria) this;
        }

        public Criteria andCitizenIdIsNotNull() {
            addCriterion("Citizen_id is not null");
            return (Criteria) this;
        }

        public Criteria andCitizenIdEqualTo(String value) {
            addCriterion("Citizen_id =", value, "citizenId");
            return (Criteria) this;
        }

        public Criteria andCitizenIdNotEqualTo(String value) {
            addCriterion("Citizen_id <>", value, "citizenId");
            return (Criteria) this;
        }

        public Criteria andCitizenIdGreaterThan(String value) {
            addCriterion("Citizen_id >", value, "citizenId");
            return (Criteria) this;
        }

        public Criteria andCitizenIdGreaterThanOrEqualTo(String value) {
            addCriterion("Citizen_id >=", value, "citizenId");
            return (Criteria) this;
        }

        public Criteria andCitizenIdLessThan(String value) {
            addCriterion("Citizen_id <", value, "citizenId");
            return (Criteria) this;
        }

        public Criteria andCitizenIdLessThanOrEqualTo(String value) {
            addCriterion("Citizen_id <=", value, "citizenId");
            return (Criteria) this;
        }

        public Criteria andCitizenIdLike(String value) {
            addCriterion("Citizen_id like", value, "citizenId");
            return (Criteria) this;
        }

        public Criteria andCitizenIdNotLike(String value) {
            addCriterion("Citizen_id not like", value, "citizenId");
            return (Criteria) this;
        }

        public Criteria andCitizenIdIn(List<String> values) {
            addCriterion("Citizen_id in", values, "citizenId");
            return (Criteria) this;
        }

        public Criteria andCitizenIdNotIn(List<String> values) {
            addCriterion("Citizen_id not in", values, "citizenId");
            return (Criteria) this;
        }

        public Criteria andCitizenIdBetween(String value1, String value2) {
            addCriterion("Citizen_id between", value1, value2, "citizenId");
            return (Criteria) this;
        }

        public Criteria andCitizenIdNotBetween(String value1, String value2) {
            addCriterion("Citizen_id not between", value1, value2, "citizenId");
            return (Criteria) this;
        }

        public Criteria andFirstTimeIsNull() {
            addCriterion("first_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstTimeIsNotNull() {
            addCriterion("first_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstTimeEqualTo(Date value) {
            addCriterionForJDBCDate("first_time =", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("first_time <>", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("first_time >", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("first_time >=", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeLessThan(Date value) {
            addCriterionForJDBCDate("first_time <", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("first_time <=", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeIn(List<Date> values) {
            addCriterionForJDBCDate("first_time in", values, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("first_time not in", values, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("first_time between", value1, value2, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("first_time not between", value1, value2, "firstTime");
            return (Criteria) this;
        }

        public Criteria andStimeIsNull() {
            addCriterion("stime is null");
            return (Criteria) this;
        }

        public Criteria andStimeIsNotNull() {
            addCriterion("stime is not null");
            return (Criteria) this;
        }

        public Criteria andStimeEqualTo(Date value) {
            addCriterionForJDBCDate("stime =", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("stime <>", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThan(Date value) {
            addCriterionForJDBCDate("stime >", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stime >=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThan(Date value) {
            addCriterionForJDBCDate("stime <", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stime <=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeIn(List<Date> values) {
            addCriterionForJDBCDate("stime in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("stime not in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stime between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stime not between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNull() {
            addCriterion("etime is null");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNotNull() {
            addCriterion("etime is not null");
            return (Criteria) this;
        }

        public Criteria andEtimeEqualTo(Date value) {
            addCriterionForJDBCDate("etime =", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("etime <>", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("etime >", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("etime >=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThan(Date value) {
            addCriterionForJDBCDate("etime <", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("etime <=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeIn(List<Date> values) {
            addCriterionForJDBCDate("etime in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("etime not in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("etime between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("etime not between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}