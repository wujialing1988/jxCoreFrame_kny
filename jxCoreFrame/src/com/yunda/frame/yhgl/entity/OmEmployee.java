package com.yunda.frame.yhgl.entity;

import java.util.Date;

/**
 * OmEmployee generated by MyEclipse Persistence Tools 人员表结构
 */

@SuppressWarnings("serial")
public class OmEmployee implements java.io.Serializable {
    
    // Fields
    
    private Long empid; // 人员编号
    
    private String empcode; // 人员代码
    
    private Long operatorid; // 操作员编号
    
    private String userid; // 操作员登录号
    
    private String empname; // 人员姓名
    
    private String realname; // 人员全名
    
    private String gender; // 性别
    
    private Date birthdate; // 出生日期
    
    private Long position; // 基本岗位
    
    private String empstatus; // 状态
    
    private String cardtype; // 证件类型
    
    private String cardno; // 证件号码
    
    private Date indate; // 入职时间
    
    private Date outdate; // 离职时间
    
    private String otel; // 办公室电话
    
    private String oaddress; // 办公室地址
    
    private String ozipcode; // 办公邮编
    
    private String oemail; // 办公EMAIL
    
    private String faxno; // 传真号码
    
    private String mobileno; // 移动电话号码
    
    private String msn; // msn 账号
    
    private String htel; // 家庭电话
    
    private String haddress; // 家庭地址
    
    private String hzipcode; // 家庭邮编
    
    private String pemail; // 私人EMAIL
    
    private String party; // 政治面貌
    
    private String degree; // 职称
    
    private Long major; // 直接主管
    
    private String specialty; // 可授权角色
    
    private String workexp; // 工作描述
    
    private Date regdate; // 注册日期
    
    private Date createtime; // 创建时间
    
    private Date lastmodytime; // 最后更新时间
    
    private String orgidlist; // 可管理机构
    
    private Long orgid; // 主机构编号
    
    private String remark; // 备注
    
    private String cardNum;// 员工IC卡号
    
    private String payId;// 工资代码
    
    private String orgname; // 附加字段
    
    private String orgseq;  // 组织机构序列
    
    private String posiname; // 附加字段 (主岗位名称) - 人员管理
    
    private String dutyname; // 附加字段 (主职务名称) --人员管理
    
    private String nposiname; // 附加字段 (次要岗位名称) --人员管理
    
    private String ndutyname; // 附加字段 (次要职务名称) --人员管理
    
    private String opstate; // 附加字段(操作员状态)
    
    private String orgnamepath; // 附加字段（人员所属组织机构名称序列）、人员管理
    
    private String groupname; // 附加字段（工作组名称） 基础管理-工作组管理中使用、人员管理
    
    /**
     * 人员管理列表中，需要查看人员-机构、人员-工作组、人员-岗位（主/次）、人员-职务（主/次）等信息
     */
    public OmEmployee(Long empid, String empcode, Long operatorid, String userid, String empname, String realname, String gender, Date birthdate,
        Long position, String empstatus, String cardtype, String cardno, Date indate, Date outdate, String otel, String oaddress, String ozipcode,
        String oemail, String faxno, String mobileno, String msn, String htel, String haddress, String hzipcode, String pemail, String party,
        String degree, Long major, String specialty, String workexp, Date regdate, Date createtime, Date lastmodytime, String orgidlist, Long orgid,
        String remark, String cardNum, String payId, String orgname, String posiname, String dutyname, String groupname, String nposiname,
        String ndutyname) {
        this.empid = empid;
        this.empcode = empcode;
        this.operatorid = operatorid;
        this.userid = userid;
        this.empname = empname;
        this.realname = realname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.position = position;
        this.empstatus = empstatus;
        this.cardtype = cardtype;
        this.cardno = cardno;
        this.indate = indate;
        this.outdate = outdate;
        this.otel = otel;
        this.oaddress = oaddress;
        this.ozipcode = ozipcode;
        this.oemail = oemail;
        this.faxno = faxno;
        this.mobileno = mobileno;
        this.msn = msn;
        this.htel = htel;
        this.haddress = haddress;
        this.hzipcode = hzipcode;
        this.pemail = pemail;
        this.party = party;
        this.degree = degree;
        this.major = major;
        this.specialty = specialty;
        this.workexp = workexp;
        this.regdate = regdate;
        this.createtime = createtime;
        this.lastmodytime = lastmodytime;
        this.orgidlist = orgidlist;
        this.orgid = orgid;
        this.remark = remark;
        this.cardNum = cardNum;
        this.payId = payId;
        this.orgname = orgname;
        this.posiname = posiname;
        this.dutyname = dutyname;
        this.groupname = groupname;
        this.nposiname = nposiname;
        this.ndutyname = ndutyname;
    }
    
    public OmEmployee(Long empid, String empcode, Long operatorid, String userid, String empname, String realname, String gender, Date birthdate,
        Long position, String empstatus, String cardtype, String cardno, Date indate, Date outdate, String otel, String oaddress, String ozipcode,
        String oemail, String faxno, String mobileno, String msn, String htel, String haddress, String hzipcode, String pemail, String party,
        String degree, Long major, String specialty, String workexp, Date regdate, Date createtime, Date lastmodytime, String orgidlist, Long orgid,
        String remark, String cardNum, String orgname) {
        super();
        this.empid = empid;
        this.empcode = empcode;
        this.operatorid = operatorid;
        this.userid = userid;
        this.empname = empname;
        this.realname = realname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.position = position;
        this.empstatus = empstatus;
        this.cardtype = cardtype;
        this.cardno = cardno;
        this.indate = indate;
        this.outdate = outdate;
        this.otel = otel;
        this.oaddress = oaddress;
        this.ozipcode = ozipcode;
        this.oemail = oemail;
        this.faxno = faxno;
        this.mobileno = mobileno;
        this.msn = msn;
        this.htel = htel;
        this.haddress = haddress;
        this.hzipcode = hzipcode;
        this.pemail = pemail;
        this.party = party;
        this.degree = degree;
        this.major = major;
        this.specialty = specialty;
        this.workexp = workexp;
        this.regdate = regdate;
        this.createtime = createtime;
        this.lastmodytime = lastmodytime;
        this.orgidlist = orgidlist;
        this.orgid = orgid;
        this.remark = remark;
        this.cardNum = cardNum;
        this.orgname = orgname;
    }
    
    /**
     * <li>说明：
     * <li>返回值： the orgnamepath
     */
    public String getOrgnamepath() {
        return orgnamepath;
    }
    
    /**
     * <li>说明：
     * <li>参数： orgnamepath
     */
    public void setOrgnamepath(String orgnamepath) {
        this.orgnamepath = orgnamepath;
    }
    
    /**
     * 覆盖重写equals对象比较方法
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj instanceof OmEmployee) {
            OmEmployee emp = (OmEmployee) obj;
            if (emp.getEmpid() == this.empid)
                return true;
        }
        return false;
    }
    
    /*
     * private Set<OmEmporg> omEmporgs = new HashSet<OmEmporg>(); private Set<OmEmpposition> omEmppositions = new HashSet<OmEmpposition>();
     */

    // Constructors
    /** default constructor */
    public OmEmployee() {
        
    }
    
    public OmEmployee(Long empid, String empname, Long operatorid) {
        this.empid = empid;
        this.operatorid = operatorid;
        this.empname = empname;
    }
    
    public OmEmployee(Long empid, String userid, String empname, String empcode) {
        this.empid = empid;
        this.empcode = empcode;
        this.userid = userid;
        this.empname = empname;
    }
    
    public OmEmployee(Long empid, String userid, String empname, String empcode, Long orgid) {
        this.empid = empid;
        this.empcode = empcode;
        this.userid = userid;
        this.empname = empname;
        this.orgid = orgid;
    }
    
    public OmEmployee(Long empid, String empcode, String empname, String gender, String empstatus, Long orgid, String userid, String cardno) {
        this.empid = empid;
        this.empcode = empcode;
        this.empname = empname;
        this.gender = gender;
        this.empstatus = empstatus;
        this.userid = userid;
        this.cardno = cardno;
        this.orgid = orgid;
    }
    
    public OmEmployee(Long empid, String empcode, Long operatorid, String userid, String empname, String realname, String gender, Date birthdate,
        Long position, String empstatus, String cardtype, String cardno, Date indate, Date outdate, String otel, String oaddress, String ozipcode,
        String oemail, String faxno, String mobileno, String msn, String htel, String haddress, String hzipcode, String pemail, String party,
        String degree, Long major, String specialty, String workexp, Date regdate, Date createtime, Date lastmodytime, String orgidlist, Long orgid,
        String remark, String cardNum, String payId, String orgname) {
        this.empid = empid;
        this.empcode = empcode;
        this.operatorid = operatorid;
        this.userid = userid;
        this.empname = empname;
        this.realname = realname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.position = position;
        this.empstatus = empstatus;
        this.cardtype = cardtype;
        this.cardno = cardno;
        this.indate = indate;
        this.outdate = outdate;
        this.otel = otel;
        this.oaddress = oaddress;
        this.ozipcode = ozipcode;
        this.oemail = oemail;
        this.faxno = faxno;
        this.mobileno = mobileno;
        this.msn = msn;
        this.htel = htel;
        this.haddress = haddress;
        this.hzipcode = hzipcode;
        this.pemail = pemail;
        this.party = party;
        this.degree = degree;
        this.major = major;
        this.specialty = specialty;
        this.workexp = workexp;
        this.regdate = regdate;
        this.createtime = createtime;
        this.lastmodytime = lastmodytime;
        this.orgidlist = orgidlist;
        this.orgid = orgid;
        this.remark = remark;
        this.cardNum = cardNum;
        this.payId = payId;
        this.orgname = orgname;
    }
    
    public OmEmployee(Long empid, String empcode, Long operatorid, String userid, String empname, String realname, String gender, Date birthdate,
        Long position, String empstatus, String cardtype, String cardno, Date indate, Date outdate, String otel, String oaddress, String ozipcode,
        String oemail, String faxno, String mobileno, String msn, String htel, String haddress, String hzipcode, String pemail, String party,
        String degree, Long major, String specialty, String workexp, Date regdate, Date createtime, Date lastmodytime, String orgidlist, Long orgid,
        String remark, String cardNum/* , Set<OmEmporg> omEmporgs, Set<OmEmpposition> omEmppositions */) {
        this.empid = empid;
        this.empcode = empcode;
        this.operatorid = operatorid;
        this.userid = userid;
        this.empname = empname;
        this.realname = realname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.position = position;
        this.empstatus = empstatus;
        this.cardtype = cardtype;
        this.cardno = cardno;
        this.indate = indate;
        this.outdate = outdate;
        this.otel = otel;
        this.oaddress = oaddress;
        this.ozipcode = ozipcode;
        this.oemail = oemail;
        this.faxno = faxno;
        this.mobileno = mobileno;
        this.msn = msn;
        this.htel = htel;
        this.haddress = haddress;
        this.hzipcode = hzipcode;
        this.pemail = pemail;
        this.party = party;
        this.degree = degree;
        this.major = major;
        this.specialty = specialty;
        this.workexp = workexp;
        this.regdate = regdate;
        this.createtime = createtime;
        this.lastmodytime = lastmodytime;
        this.orgidlist = orgidlist;
        this.orgid = orgid;
        this.remark = remark;
        this.cardNum = cardNum;
        /*
         * this.omEmporgs = omEmporgs; this.omEmppositions = omEmppositions;
         */
    }
    
    /**
     * <li>说明：该带参构造函数用与工作组管理中工作组/岗位直属人员信息列表查询功能，
     * <li> 业务类：com.yunda.yhgl.manager.EmployeeManager
     * <li> 函数名：findEmpListByGroupNode()、findEmpListByPosiNode()
     * <li>字段说明： empid —— 人员ID
     * <li> userid —— 登录帐号
     * <li> empname —— 人员姓名
     * <li> empstatus —— 人员状态
     * <li> orgname —— 主机构名
     * <li> groupname —— 所属工作组/岗位名
     * <li>创建人：谭诚
     * <li>创建日期：2013-11-21
     * <li>修改人：
     * <li>修改日期：
     */
    public OmEmployee(Long empid, String userid, String empname, String empstatus, String orgname, String groupname) {
        this.empid = empid;
        this.userid = userid;
        this.empname = empname;
        this.empstatus = empstatus;
        this.orgname = orgname;
        this.groupname = groupname;
    }
    
    public Long getEmpid() {
        return empid;
    }
    
    public void setEmpid(Long empid) {
        this.empid = empid;
    }
    
    public String getEmpcode() {
        return this.empcode;
    }
    
    public void setEmpcode(String empcode) {
        this.empcode = empcode;
    }
    
    public Long getOperatorid() {
        return this.operatorid;
    }
    
    public void setOperatorid(Long operatorid) {
        this.operatorid = operatorid;
    }
    
    public String getUserid() {
        return this.userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }
    
    public String getEmpname() {
        return this.empname;
    }
    
    public void setEmpname(String empname) {
        this.empname = empname;
    }
    
    public String getRealname() {
        return this.realname;
    }
    
    public void setRealname(String realname) {
        this.realname = realname;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public Date getBirthdate() {
        return this.birthdate;
    }
    
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    
    public Long getPosition() {
        return this.position;
    }
    
    public void setPosition(Long position) {
        this.position = position;
    }
    
    public String getEmpstatus() {
        return this.empstatus;
    }
    
    public void setEmpstatus(String empstatus) {
        this.empstatus = empstatus;
    }
    
    public String getCardtype() {
        return this.cardtype;
    }
    
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }
    
    public String getCardno() {
        return this.cardno;
    }
    
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }
    
    public Date getIndate() {
        return this.indate;
    }
    
    public void setIndate(Date indate) {
        this.indate = indate;
    }
    
    public Date getOutdate() {
        return this.outdate;
    }
    
    public void setOutdate(Date outdate) {
        this.outdate = outdate;
    }
    
    public String getOtel() {
        return this.otel;
    }
    
    public void setOtel(String otel) {
        this.otel = otel;
    }
    
    public String getOaddress() {
        return this.oaddress;
    }
    
    public void setOaddress(String oaddress) {
        this.oaddress = oaddress;
    }
    
    public String getOzipcode() {
        return this.ozipcode;
    }
    
    public void setOzipcode(String ozipcode) {
        this.ozipcode = ozipcode;
    }
    
    public String getOemail() {
        return this.oemail;
    }
    
    public void setOemail(String oemail) {
        this.oemail = oemail;
    }
    
    public String getFaxno() {
        return this.faxno;
    }
    
    public void setFaxno(String faxno) {
        this.faxno = faxno;
    }
    
    public String getMobileno() {
        return this.mobileno;
    }
    
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }
    
    public String getMsn() {
        return this.msn;
    }
    
    public void setMsn(String msn) {
        this.msn = msn;
    }
    
    public String getHtel() {
        return this.htel;
    }
    
    public void setHtel(String htel) {
        this.htel = htel;
    }
    
    public String getHaddress() {
        return this.haddress;
    }
    
    public void setHaddress(String haddress) {
        this.haddress = haddress;
    }
    
    public String getHzipcode() {
        return this.hzipcode;
    }
    
    public void setHzipcode(String hzipcode) {
        this.hzipcode = hzipcode;
    }
    
    public String getPemail() {
        return this.pemail;
    }
    
    public void setPemail(String pemail) {
        this.pemail = pemail;
    }
    
    public String getParty() {
        return this.party;
    }
    
    public void setParty(String party) {
        this.party = party;
    }
    
    public String getDegree() {
        return this.degree;
    }
    
    public void setDegree(String degree) {
        this.degree = degree;
    }
    
    public Long getMajor() {
        return this.major;
    }
    
    public void setMajor(Long major) {
        this.major = major;
    }
    
    public String getSpecialty() {
        return this.specialty;
    }
    
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    
    public String getWorkexp() {
        return this.workexp;
    }
    
    public void setWorkexp(String workexp) {
        this.workexp = workexp;
    }
    
    public Date getRegdate() {
        return this.regdate;
    }
    
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }
    
    public Date getCreatetime() {
        return this.createtime;
    }
    
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    
    public Date getLastmodytime() {
        return this.lastmodytime;
    }
    
    public void setLastmodytime(Date lastmodytime) {
        this.lastmodytime = lastmodytime;
    }
    
    public String getOrgidlist() {
        return this.orgidlist;
    }
    
    public void setOrgidlist(String orgidlist) {
        this.orgidlist = orgidlist;
    }
    
    public Long getOrgid() {
        return this.orgid;
    }
    
    public void setOrgid(Long orgid) {
        this.orgid = orgid;
    }
    
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public String getCardNum() {
        return cardNum;
    }
    
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }
    
    public String getOrgname() {
        return orgname;
    }
    
    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }
    
    public String getOpstate() {
        return opstate;
    }
    
    public void setOpstate(String opstate) {
        this.opstate = opstate;
    }
    
    public String getPayId() {
        return payId;
    }
    
    public void setPayId(String payId) {
        this.payId = payId;
    }
    
    /**
     * <li>说明：
     * <li>返回值： the groupname
     */
    public String getGroupname() {
        return groupname;
    }
    
    /**
     * <li>说明：
     * <li>参数： groupname
     */
    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
    
    public String getDutyname() {
        return dutyname;
    }
    
    public void setDutyname(String dutyname) {
        this.dutyname = dutyname;
    }
    
    public String getNdutyname() {
        return ndutyname;
    }
    
    public void setNdutyname(String ndutyname) {
        this.ndutyname = ndutyname;
    }
    
    public String getNposiname() {
        return nposiname;
    }
    
    public void setNposiname(String nposiname) {
        this.nposiname = nposiname;
    }
    
    public String getPosiname() {
        return posiname;
    }
    
    public void setPosiname(String posiname) {
        this.posiname = posiname;
    }
    
    public String getOrgseq() {
        return orgseq;
    }
    
    public void setOrgseq(String orgseq) {
        this.orgseq = orgseq;
    }
    
    /*public Set<OmEmporg> getOmEmporgs() {
        return omEmporgs;
    }
    
    public void setOmEmporgs(Set<OmEmporg> omEmporgs) {
        this.omEmporgs = omEmporgs;
    }
    
    public Set<OmEmpposition> getOmEmppositions() {
        return omEmppositions;
    }
    
    public void setOmEmppositions(Set<OmEmpposition> omEmppositions) {
        this.omEmppositions = omEmppositions;
    }*/
    
}