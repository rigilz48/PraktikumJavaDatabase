/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasidatabase;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author 100 Mbps
 */
@Entity
@Table(name = "biodata_mhs", catalog = "latihan_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "BiodataMhs.findAll", query = "SELECT b FROM BiodataMhs b")
    , @NamedQuery(name = "BiodataMhs.findByNim", query = "SELECT b FROM BiodataMhs b WHERE b.nim = :nim")
    , @NamedQuery(name = "BiodataMhs.findByNama", query = "SELECT b FROM BiodataMhs b WHERE b.nama = :nama")
    , @NamedQuery(name = "BiodataMhs.findByJenisKelamin", query = "SELECT b FROM BiodataMhs b WHERE b.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "BiodataMhs.findByTanggalLahir", query = "SELECT b FROM BiodataMhs b WHERE b.tanggalLahir = :tanggalLahir")
    , @NamedQuery(name = "BiodataMhs.findByFakultas", query = "SELECT b FROM BiodataMhs b WHERE b.fakultas = :fakultas")
    , @NamedQuery(name = "BiodataMhs.findByJurusan", query = "SELECT b FROM BiodataMhs b WHERE b.jurusan = :jurusan")
    , @NamedQuery(name = "BiodataMhs.findByAngkatan", query = "SELECT b FROM BiodataMhs b WHERE b.angkatan = :angkatan")})
public class BiodataMhs implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nim")
    private String nim;
    @Column(name = "nama")
    private String nama;
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Column(name = "tanggal_lahir")
    @Temporal(TemporalType.DATE)
    private Date tanggalLahir;
    @Lob
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "fakultas")
    private String fakultas;
    @Column(name = "jurusan")
    private String jurusan;
    @Column(name = "angkatan")
    private String angkatan;

    public BiodataMhs() {
    }

    public BiodataMhs(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        String oldNim = this.nim;
        this.nim = nim;
        changeSupport.firePropertyChange("nim", oldNim, nim);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        String oldJenisKelamin = this.jenisKelamin;
        this.jenisKelamin = jenisKelamin;
        changeSupport.firePropertyChange("jenisKelamin", oldJenisKelamin, jenisKelamin);
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        Date oldTanggalLahir = this.tanggalLahir;
        this.tanggalLahir = tanggalLahir;
        changeSupport.firePropertyChange("tanggalLahir", oldTanggalLahir, tanggalLahir);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        String oldFakultas = this.fakultas;
        this.fakultas = fakultas;
        changeSupport.firePropertyChange("fakultas", oldFakultas, fakultas);
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        String oldJurusan = this.jurusan;
        this.jurusan = jurusan;
        changeSupport.firePropertyChange("jurusan", oldJurusan, jurusan);
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        String oldAngkatan = this.angkatan;
        this.angkatan = angkatan;
        changeSupport.firePropertyChange("angkatan", oldAngkatan, angkatan);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nim != null ? nim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BiodataMhs)) {
            return false;
        }
        BiodataMhs other = (BiodataMhs) object;
        if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aplikasidatabase.BiodataMhs[ nim=" + nim + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
