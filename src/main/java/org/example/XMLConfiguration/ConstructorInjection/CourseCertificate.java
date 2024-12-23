package org.example.XMLConfiguration.ConstructorInjection;

public class CourseCertificate {

    private String certificateName;
    private int certificateNumber;

    public CourseCertificate(String certificateName,int certificateNumber){
        this.certificateName=certificateName;
        this.certificateNumber=certificateNumber;
    }

    public CourseCertificate(){

    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public int getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(int certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

}
