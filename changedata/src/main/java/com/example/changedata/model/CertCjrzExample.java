package com.example.changedata.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CertCjrzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CertCjrzExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Integer value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Integer value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Integer value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Integer value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Integer> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Integer> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andIssuingOrgIdIsNull() {
            addCriterion("issuing_org_id is null");
            return (Criteria) this;
        }

        public Criteria andIssuingOrgIdIsNotNull() {
            addCriterion("issuing_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andIssuingOrgIdEqualTo(Integer value) {
            addCriterion("issuing_org_id =", value, "issuingOrgId");
            return (Criteria) this;
        }

        public Criteria andIssuingOrgIdNotEqualTo(Integer value) {
            addCriterion("issuing_org_id <>", value, "issuingOrgId");
            return (Criteria) this;
        }

        public Criteria andIssuingOrgIdGreaterThan(Integer value) {
            addCriterion("issuing_org_id >", value, "issuingOrgId");
            return (Criteria) this;
        }

        public Criteria andIssuingOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("issuing_org_id >=", value, "issuingOrgId");
            return (Criteria) this;
        }

        public Criteria andIssuingOrgIdLessThan(Integer value) {
            addCriterion("issuing_org_id <", value, "issuingOrgId");
            return (Criteria) this;
        }

        public Criteria andIssuingOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("issuing_org_id <=", value, "issuingOrgId");
            return (Criteria) this;
        }

        public Criteria andIssuingOrgIdIn(List<Integer> values) {
            addCriterion("issuing_org_id in", values, "issuingOrgId");
            return (Criteria) this;
        }

        public Criteria andIssuingOrgIdNotIn(List<Integer> values) {
            addCriterion("issuing_org_id not in", values, "issuingOrgId");
            return (Criteria) this;
        }

        public Criteria andIssuingOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("issuing_org_id between", value1, value2, "issuingOrgId");
            return (Criteria) this;
        }

        public Criteria andIssuingOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("issuing_org_id not between", value1, value2, "issuingOrgId");
            return (Criteria) this;
        }

        public Criteria andCertNumberIsNull() {
            addCriterion("cert_number is null");
            return (Criteria) this;
        }

        public Criteria andCertNumberIsNotNull() {
            addCriterion("cert_number is not null");
            return (Criteria) this;
        }

        public Criteria andCertNumberEqualTo(String value) {
            addCriterion("cert_number =", value, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberNotEqualTo(String value) {
            addCriterion("cert_number <>", value, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberGreaterThan(String value) {
            addCriterion("cert_number >", value, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cert_number >=", value, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberLessThan(String value) {
            addCriterion("cert_number <", value, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberLessThanOrEqualTo(String value) {
            addCriterion("cert_number <=", value, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberLike(String value) {
            addCriterion("cert_number like", value, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberNotLike(String value) {
            addCriterion("cert_number not like", value, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberIn(List<String> values) {
            addCriterion("cert_number in", values, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberNotIn(List<String> values) {
            addCriterion("cert_number not in", values, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberBetween(String value1, String value2) {
            addCriterion("cert_number between", value1, value2, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertNumberNotBetween(String value1, String value2) {
            addCriterion("cert_number not between", value1, value2, "certNumber");
            return (Criteria) this;
        }

        public Criteria andCertIdentifierIsNull() {
            addCriterion("cert_identifier is null");
            return (Criteria) this;
        }

        public Criteria andCertIdentifierIsNotNull() {
            addCriterion("cert_identifier is not null");
            return (Criteria) this;
        }

        public Criteria andCertIdentifierEqualTo(String value) {
            addCriterion("cert_identifier =", value, "certIdentifier");
            return (Criteria) this;
        }

        public Criteria andCertIdentifierNotEqualTo(String value) {
            addCriterion("cert_identifier <>", value, "certIdentifier");
            return (Criteria) this;
        }

        public Criteria andCertIdentifierGreaterThan(String value) {
            addCriterion("cert_identifier >", value, "certIdentifier");
            return (Criteria) this;
        }

        public Criteria andCertIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("cert_identifier >=", value, "certIdentifier");
            return (Criteria) this;
        }

        public Criteria andCertIdentifierLessThan(String value) {
            addCriterion("cert_identifier <", value, "certIdentifier");
            return (Criteria) this;
        }

        public Criteria andCertIdentifierLessThanOrEqualTo(String value) {
            addCriterion("cert_identifier <=", value, "certIdentifier");
            return (Criteria) this;
        }

        public Criteria andCertIdentifierLike(String value) {
            addCriterion("cert_identifier like", value, "certIdentifier");
            return (Criteria) this;
        }

        public Criteria andCertIdentifierNotLike(String value) {
            addCriterion("cert_identifier not like", value, "certIdentifier");
            return (Criteria) this;
        }

        public Criteria andCertIdentifierIn(List<String> values) {
            addCriterion("cert_identifier in", values, "certIdentifier");
            return (Criteria) this;
        }

        public Criteria andCertIdentifierNotIn(List<String> values) {
            addCriterion("cert_identifier not in", values, "certIdentifier");
            return (Criteria) this;
        }

        public Criteria andCertIdentifierBetween(String value1, String value2) {
            addCriterion("cert_identifier between", value1, value2, "certIdentifier");
            return (Criteria) this;
        }

        public Criteria andCertIdentifierNotBetween(String value1, String value2) {
            addCriterion("cert_identifier not between", value1, value2, "certIdentifier");
            return (Criteria) this;
        }

        public Criteria andOwnersfzhmIsNull() {
            addCriterion("ownersfzhm is null");
            return (Criteria) this;
        }

        public Criteria andOwnersfzhmIsNotNull() {
            addCriterion("ownersfzhm is not null");
            return (Criteria) this;
        }

        public Criteria andOwnersfzhmEqualTo(String value) {
            addCriterion("ownersfzhm =", value, "ownersfzhm");
            return (Criteria) this;
        }

        public Criteria andOwnersfzhmNotEqualTo(String value) {
            addCriterion("ownersfzhm <>", value, "ownersfzhm");
            return (Criteria) this;
        }

        public Criteria andOwnersfzhmGreaterThan(String value) {
            addCriterion("ownersfzhm >", value, "ownersfzhm");
            return (Criteria) this;
        }

        public Criteria andOwnersfzhmGreaterThanOrEqualTo(String value) {
            addCriterion("ownersfzhm >=", value, "ownersfzhm");
            return (Criteria) this;
        }

        public Criteria andOwnersfzhmLessThan(String value) {
            addCriterion("ownersfzhm <", value, "ownersfzhm");
            return (Criteria) this;
        }

        public Criteria andOwnersfzhmLessThanOrEqualTo(String value) {
            addCriterion("ownersfzhm <=", value, "ownersfzhm");
            return (Criteria) this;
        }

        public Criteria andOwnersfzhmLike(String value) {
            addCriterion("ownersfzhm like", value, "ownersfzhm");
            return (Criteria) this;
        }

        public Criteria andOwnersfzhmNotLike(String value) {
            addCriterion("ownersfzhm not like", value, "ownersfzhm");
            return (Criteria) this;
        }

        public Criteria andOwnersfzhmIn(List<String> values) {
            addCriterion("ownersfzhm in", values, "ownersfzhm");
            return (Criteria) this;
        }

        public Criteria andOwnersfzhmNotIn(List<String> values) {
            addCriterion("ownersfzhm not in", values, "ownersfzhm");
            return (Criteria) this;
        }

        public Criteria andOwnersfzhmBetween(String value1, String value2) {
            addCriterion("ownersfzhm between", value1, value2, "ownersfzhm");
            return (Criteria) this;
        }

        public Criteria andOwnersfzhmNotBetween(String value1, String value2) {
            addCriterion("ownersfzhm not between", value1, value2, "ownersfzhm");
            return (Criteria) this;
        }

        public Criteria andCreditcodeIsNull() {
            addCriterion("creditcode is null");
            return (Criteria) this;
        }

        public Criteria andCreditcodeIsNotNull() {
            addCriterion("creditcode is not null");
            return (Criteria) this;
        }

        public Criteria andCreditcodeEqualTo(String value) {
            addCriterion("creditcode =", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotEqualTo(String value) {
            addCriterion("creditcode <>", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeGreaterThan(String value) {
            addCriterion("creditcode >", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeGreaterThanOrEqualTo(String value) {
            addCriterion("creditcode >=", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeLessThan(String value) {
            addCriterion("creditcode <", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeLessThanOrEqualTo(String value) {
            addCriterion("creditcode <=", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeLike(String value) {
            addCriterion("creditcode like", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotLike(String value) {
            addCriterion("creditcode not like", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeIn(List<String> values) {
            addCriterion("creditcode in", values, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotIn(List<String> values) {
            addCriterion("creditcode not in", values, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeBetween(String value1, String value2) {
            addCriterion("creditcode between", value1, value2, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotBetween(String value1, String value2) {
            addCriterion("creditcode not between", value1, value2, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCertnoIsNull() {
            addCriterion("certno is null");
            return (Criteria) this;
        }

        public Criteria andCertnoIsNotNull() {
            addCriterion("certno is not null");
            return (Criteria) this;
        }

        public Criteria andCertnoEqualTo(String value) {
            addCriterion("certno =", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotEqualTo(String value) {
            addCriterion("certno <>", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoGreaterThan(String value) {
            addCriterion("certno >", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoGreaterThanOrEqualTo(String value) {
            addCriterion("certno >=", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoLessThan(String value) {
            addCriterion("certno <", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoLessThanOrEqualTo(String value) {
            addCriterion("certno <=", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoLike(String value) {
            addCriterion("certno like", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotLike(String value) {
            addCriterion("certno not like", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoIn(List<String> values) {
            addCriterion("certno in", values, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotIn(List<String> values) {
            addCriterion("certno not in", values, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoBetween(String value1, String value2) {
            addCriterion("certno between", value1, value2, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotBetween(String value1, String value2) {
            addCriterion("certno not between", value1, value2, "certno");
            return (Criteria) this;
        }

        public Criteria andFaceimgIsNull() {
            addCriterion("faceimg is null");
            return (Criteria) this;
        }

        public Criteria andFaceimgIsNotNull() {
            addCriterion("faceimg is not null");
            return (Criteria) this;
        }

        public Criteria andFaceimgEqualTo(String value) {
            addCriterion("faceimg =", value, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgNotEqualTo(String value) {
            addCriterion("faceimg <>", value, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgGreaterThan(String value) {
            addCriterion("faceimg >", value, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgGreaterThanOrEqualTo(String value) {
            addCriterion("faceimg >=", value, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgLessThan(String value) {
            addCriterion("faceimg <", value, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgLessThanOrEqualTo(String value) {
            addCriterion("faceimg <=", value, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgLike(String value) {
            addCriterion("faceimg like", value, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgNotLike(String value) {
            addCriterion("faceimg not like", value, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgIn(List<String> values) {
            addCriterion("faceimg in", values, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgNotIn(List<String> values) {
            addCriterion("faceimg not in", values, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgBetween(String value1, String value2) {
            addCriterion("faceimg between", value1, value2, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgNotBetween(String value1, String value2) {
            addCriterion("faceimg not between", value1, value2, "faceimg");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andCjtypeIsNull() {
            addCriterion("cjtype is null");
            return (Criteria) this;
        }

        public Criteria andCjtypeIsNotNull() {
            addCriterion("cjtype is not null");
            return (Criteria) this;
        }

        public Criteria andCjtypeEqualTo(String value) {
            addCriterion("cjtype =", value, "cjtype");
            return (Criteria) this;
        }

        public Criteria andCjtypeNotEqualTo(String value) {
            addCriterion("cjtype <>", value, "cjtype");
            return (Criteria) this;
        }

        public Criteria andCjtypeGreaterThan(String value) {
            addCriterion("cjtype >", value, "cjtype");
            return (Criteria) this;
        }

        public Criteria andCjtypeGreaterThanOrEqualTo(String value) {
            addCriterion("cjtype >=", value, "cjtype");
            return (Criteria) this;
        }

        public Criteria andCjtypeLessThan(String value) {
            addCriterion("cjtype <", value, "cjtype");
            return (Criteria) this;
        }

        public Criteria andCjtypeLessThanOrEqualTo(String value) {
            addCriterion("cjtype <=", value, "cjtype");
            return (Criteria) this;
        }

        public Criteria andCjtypeLike(String value) {
            addCriterion("cjtype like", value, "cjtype");
            return (Criteria) this;
        }

        public Criteria andCjtypeNotLike(String value) {
            addCriterion("cjtype not like", value, "cjtype");
            return (Criteria) this;
        }

        public Criteria andCjtypeIn(List<String> values) {
            addCriterion("cjtype in", values, "cjtype");
            return (Criteria) this;
        }

        public Criteria andCjtypeNotIn(List<String> values) {
            addCriterion("cjtype not in", values, "cjtype");
            return (Criteria) this;
        }

        public Criteria andCjtypeBetween(String value1, String value2) {
            addCriterion("cjtype between", value1, value2, "cjtype");
            return (Criteria) this;
        }

        public Criteria andCjtypeNotBetween(String value1, String value2) {
            addCriterion("cjtype not between", value1, value2, "cjtype");
            return (Criteria) this;
        }

        public Criteria andCjlevelIsNull() {
            addCriterion("cjlevel is null");
            return (Criteria) this;
        }

        public Criteria andCjlevelIsNotNull() {
            addCriterion("cjlevel is not null");
            return (Criteria) this;
        }

        public Criteria andCjlevelEqualTo(String value) {
            addCriterion("cjlevel =", value, "cjlevel");
            return (Criteria) this;
        }

        public Criteria andCjlevelNotEqualTo(String value) {
            addCriterion("cjlevel <>", value, "cjlevel");
            return (Criteria) this;
        }

        public Criteria andCjlevelGreaterThan(String value) {
            addCriterion("cjlevel >", value, "cjlevel");
            return (Criteria) this;
        }

        public Criteria andCjlevelGreaterThanOrEqualTo(String value) {
            addCriterion("cjlevel >=", value, "cjlevel");
            return (Criteria) this;
        }

        public Criteria andCjlevelLessThan(String value) {
            addCriterion("cjlevel <", value, "cjlevel");
            return (Criteria) this;
        }

        public Criteria andCjlevelLessThanOrEqualTo(String value) {
            addCriterion("cjlevel <=", value, "cjlevel");
            return (Criteria) this;
        }

        public Criteria andCjlevelLike(String value) {
            addCriterion("cjlevel like", value, "cjlevel");
            return (Criteria) this;
        }

        public Criteria andCjlevelNotLike(String value) {
            addCriterion("cjlevel not like", value, "cjlevel");
            return (Criteria) this;
        }

        public Criteria andCjlevelIn(List<String> values) {
            addCriterion("cjlevel in", values, "cjlevel");
            return (Criteria) this;
        }

        public Criteria andCjlevelNotIn(List<String> values) {
            addCriterion("cjlevel not in", values, "cjlevel");
            return (Criteria) this;
        }

        public Criteria andCjlevelBetween(String value1, String value2) {
            addCriterion("cjlevel between", value1, value2, "cjlevel");
            return (Criteria) this;
        }

        public Criteria andCjlevelNotBetween(String value1, String value2) {
            addCriterion("cjlevel not between", value1, value2, "cjlevel");
            return (Criteria) this;
        }

        public Criteria andZzbfrqIsNull() {
            addCriterion("zzbfrq is null");
            return (Criteria) this;
        }

        public Criteria andZzbfrqIsNotNull() {
            addCriterion("zzbfrq is not null");
            return (Criteria) this;
        }

        public Criteria andZzbfrqEqualTo(Date value) {
            addCriterionForJDBCDate("zzbfrq =", value, "zzbfrq");
            return (Criteria) this;
        }

        public Criteria andZzbfrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("zzbfrq <>", value, "zzbfrq");
            return (Criteria) this;
        }

        public Criteria andZzbfrqGreaterThan(Date value) {
            addCriterionForJDBCDate("zzbfrq >", value, "zzbfrq");
            return (Criteria) this;
        }

        public Criteria andZzbfrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zzbfrq >=", value, "zzbfrq");
            return (Criteria) this;
        }

        public Criteria andZzbfrqLessThan(Date value) {
            addCriterionForJDBCDate("zzbfrq <", value, "zzbfrq");
            return (Criteria) this;
        }

        public Criteria andZzbfrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zzbfrq <=", value, "zzbfrq");
            return (Criteria) this;
        }

        public Criteria andZzbfrqIn(List<Date> values) {
            addCriterionForJDBCDate("zzbfrq in", values, "zzbfrq");
            return (Criteria) this;
        }

        public Criteria andZzbfrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("zzbfrq not in", values, "zzbfrq");
            return (Criteria) this;
        }

        public Criteria andZzbfrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zzbfrq between", value1, value2, "zzbfrq");
            return (Criteria) this;
        }

        public Criteria andZzbfrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zzbfrq not between", value1, value2, "zzbfrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqqsrqIsNull() {
            addCriterion("zzyxqqsrq is null");
            return (Criteria) this;
        }

        public Criteria andZzyxqqsrqIsNotNull() {
            addCriterion("zzyxqqsrq is not null");
            return (Criteria) this;
        }

        public Criteria andZzyxqqsrqEqualTo(Date value) {
            addCriterionForJDBCDate("zzyxqqsrq =", value, "zzyxqqsrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqqsrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("zzyxqqsrq <>", value, "zzyxqqsrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqqsrqGreaterThan(Date value) {
            addCriterionForJDBCDate("zzyxqqsrq >", value, "zzyxqqsrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqqsrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zzyxqqsrq >=", value, "zzyxqqsrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqqsrqLessThan(Date value) {
            addCriterionForJDBCDate("zzyxqqsrq <", value, "zzyxqqsrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqqsrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zzyxqqsrq <=", value, "zzyxqqsrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqqsrqIn(List<Date> values) {
            addCriterionForJDBCDate("zzyxqqsrq in", values, "zzyxqqsrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqqsrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("zzyxqqsrq not in", values, "zzyxqqsrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqqsrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zzyxqqsrq between", value1, value2, "zzyxqqsrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqqsrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zzyxqqsrq not between", value1, value2, "zzyxqqsrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqjzrqIsNull() {
            addCriterion("zzyxqjzrq is null");
            return (Criteria) this;
        }

        public Criteria andZzyxqjzrqIsNotNull() {
            addCriterion("zzyxqjzrq is not null");
            return (Criteria) this;
        }

        public Criteria andZzyxqjzrqEqualTo(Date value) {
            addCriterionForJDBCDate("zzyxqjzrq =", value, "zzyxqjzrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqjzrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("zzyxqjzrq <>", value, "zzyxqjzrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqjzrqGreaterThan(Date value) {
            addCriterionForJDBCDate("zzyxqjzrq >", value, "zzyxqjzrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqjzrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zzyxqjzrq >=", value, "zzyxqjzrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqjzrqLessThan(Date value) {
            addCriterionForJDBCDate("zzyxqjzrq <", value, "zzyxqjzrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqjzrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zzyxqjzrq <=", value, "zzyxqjzrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqjzrqIn(List<Date> values) {
            addCriterionForJDBCDate("zzyxqjzrq in", values, "zzyxqjzrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqjzrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("zzyxqjzrq not in", values, "zzyxqjzrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqjzrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zzyxqjzrq between", value1, value2, "zzyxqjzrq");
            return (Criteria) this;
        }

        public Criteria andZzyxqjzrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zzyxqjzrq not between", value1, value2, "zzyxqjzrq");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andBlankFileIsNull() {
            addCriterion("blank_file is null");
            return (Criteria) this;
        }

        public Criteria andBlankFileIsNotNull() {
            addCriterion("blank_file is not null");
            return (Criteria) this;
        }

        public Criteria andBlankFileEqualTo(String value) {
            addCriterion("blank_file =", value, "blankFile");
            return (Criteria) this;
        }

        public Criteria andBlankFileNotEqualTo(String value) {
            addCriterion("blank_file <>", value, "blankFile");
            return (Criteria) this;
        }

        public Criteria andBlankFileGreaterThan(String value) {
            addCriterion("blank_file >", value, "blankFile");
            return (Criteria) this;
        }

        public Criteria andBlankFileGreaterThanOrEqualTo(String value) {
            addCriterion("blank_file >=", value, "blankFile");
            return (Criteria) this;
        }

        public Criteria andBlankFileLessThan(String value) {
            addCriterion("blank_file <", value, "blankFile");
            return (Criteria) this;
        }

        public Criteria andBlankFileLessThanOrEqualTo(String value) {
            addCriterion("blank_file <=", value, "blankFile");
            return (Criteria) this;
        }

        public Criteria andBlankFileLike(String value) {
            addCriterion("blank_file like", value, "blankFile");
            return (Criteria) this;
        }

        public Criteria andBlankFileNotLike(String value) {
            addCriterion("blank_file not like", value, "blankFile");
            return (Criteria) this;
        }

        public Criteria andBlankFileIn(List<String> values) {
            addCriterion("blank_file in", values, "blankFile");
            return (Criteria) this;
        }

        public Criteria andBlankFileNotIn(List<String> values) {
            addCriterion("blank_file not in", values, "blankFile");
            return (Criteria) this;
        }

        public Criteria andBlankFileBetween(String value1, String value2) {
            addCriterion("blank_file between", value1, value2, "blankFile");
            return (Criteria) this;
        }

        public Criteria andBlankFileNotBetween(String value1, String value2) {
            addCriterion("blank_file not between", value1, value2, "blankFile");
            return (Criteria) this;
        }

        public Criteria andSignFileIsNull() {
            addCriterion("sign_file is null");
            return (Criteria) this;
        }

        public Criteria andSignFileIsNotNull() {
            addCriterion("sign_file is not null");
            return (Criteria) this;
        }

        public Criteria andSignFileEqualTo(String value) {
            addCriterion("sign_file =", value, "signFile");
            return (Criteria) this;
        }

        public Criteria andSignFileNotEqualTo(String value) {
            addCriterion("sign_file <>", value, "signFile");
            return (Criteria) this;
        }

        public Criteria andSignFileGreaterThan(String value) {
            addCriterion("sign_file >", value, "signFile");
            return (Criteria) this;
        }

        public Criteria andSignFileGreaterThanOrEqualTo(String value) {
            addCriterion("sign_file >=", value, "signFile");
            return (Criteria) this;
        }

        public Criteria andSignFileLessThan(String value) {
            addCriterion("sign_file <", value, "signFile");
            return (Criteria) this;
        }

        public Criteria andSignFileLessThanOrEqualTo(String value) {
            addCriterion("sign_file <=", value, "signFile");
            return (Criteria) this;
        }

        public Criteria andSignFileLike(String value) {
            addCriterion("sign_file like", value, "signFile");
            return (Criteria) this;
        }

        public Criteria andSignFileNotLike(String value) {
            addCriterion("sign_file not like", value, "signFile");
            return (Criteria) this;
        }

        public Criteria andSignFileIn(List<String> values) {
            addCriterion("sign_file in", values, "signFile");
            return (Criteria) this;
        }

        public Criteria andSignFileNotIn(List<String> values) {
            addCriterion("sign_file not in", values, "signFile");
            return (Criteria) this;
        }

        public Criteria andSignFileBetween(String value1, String value2) {
            addCriterion("sign_file between", value1, value2, "signFile");
            return (Criteria) this;
        }

        public Criteria andSignFileNotBetween(String value1, String value2) {
            addCriterion("sign_file not between", value1, value2, "signFile");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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