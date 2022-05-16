package MR.RES.MRAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "m_table_list")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MTableList implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "table_id", nullable = false)
    private Integer id;

    @Column(name = "table_nm_vn", length = 50)
    private String tableNmVn;

    @Column(name = "table_nm_en", length = 30)
    private String tableNmEn;

    @Column(name = "table_nm_jp", length = 50)
    private String tableNmJp;

    @Column(name = "sort_no", nullable = false, length = 10)
    private String sortNo;

    @Column(name = "table_ava", length = 200)
    private String tableAva;

    @Column(name = "capacity", nullable = false, length = 5)
    private String capacity;

    @Column(name = "crt_dt", nullable = false, length = 20)
    private String crtDt;

    @Column(name = "crt_user_id", nullable = false, length = 40)
    private String crtUserId;

    @Column(name = "crt_pgm_id", nullable = false, length = 20)
    private String crtPgmId;

    @Column(name = "upd_dt", length = 20)
    private String updDt;

    @Column(name = "upd_user_id", length = 40)
    private String updUserId;

    @Column(name = "upd_pgm_id", length = 20)
    private String updPgmId;

    @Column(name = "del_fg", nullable = false)
    private Character delFg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTableNmVn() {
        return tableNmVn;
    }

    public void setTableNmVn(String tableNmVn) {
        this.tableNmVn = tableNmVn;
    }

    public String getTableNmEn() {
        return tableNmEn;
    }

    public void setTableNmEn(String tableNmEn) {
        this.tableNmEn = tableNmEn;
    }

    public String getTableNmJp() {
        return tableNmJp;
    }

    public void setTableNmJp(String tableNmJp) {
        this.tableNmJp = tableNmJp;
    }

    public String getSortNo() {
        return sortNo;
    }

    public void setSortNo(String sortNo) {
        this.sortNo = sortNo;
    }

    public String getTableAva() {
        return tableAva;
    }

    public void setTableAva(String tableAva) {
        this.tableAva = tableAva;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(String crtDt) {
        this.crtDt = crtDt;
    }

    public String getCrtUserId() {
        return crtUserId;
    }

    public void setCrtUserId(String crtUserId) {
        this.crtUserId = crtUserId;
    }

    public String getCrtPgmId() {
        return crtPgmId;
    }

    public void setCrtPgmId(String crtPgmId) {
        this.crtPgmId = crtPgmId;
    }

    public String getUpdDt() {
        return updDt;
    }

    public void setUpdDt(String updDt) {
        this.updDt = updDt;
    }

    public String getUpdUserId() {
        return updUserId;
    }

    public void setUpdUserId(String updUserId) {
        this.updUserId = updUserId;
    }

    public String getUpdPgmId() {
        return updPgmId;
    }

    public void setUpdPgmId(String updPgmId) {
        this.updPgmId = updPgmId;
    }

    public Character getDelFg() {
        return delFg;
    }

    public void setDelFg(Character delFg) {
        this.delFg = delFg;
    }

}