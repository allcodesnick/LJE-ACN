package com.allcodesnick.den.scriptkiddie.scripts.fastjob;
// Creating a text File using FileWriter
import java.io.FileWriter;
import java.io.IOException;
// Jsoup Web Scrapper

public class ResumeBOT {
    public FileWriter fileWriter = null;
    public boolean fileExist = false;
    public boolean fileTypeTxt = false;
    public boolean fileSaved = false;
    public ResumeBOT(){
    }

    public ResumeBOT(FileWriter fileWriter, boolean fileExist, boolean fileTypeTxt, boolean fileSaved) {
        this.fileWriter = fileWriter;
        this.fileExist = fileExist;
        this.fileTypeTxt = fileTypeTxt;
        this.fileSaved = fileSaved;
    }

    public void loadResume(){

    }

    public void updateHeader() {

    }

    public void updateProjects() {

    }

    public void updateExperience() {

    }

    public void updateEducation() {

    }

    public void updateSkills() {

    }

    public boolean updated() {
        return false;
    }

    public void viewChanges() {

    }

    public void renameResume() {

    }

    public void closeResume(){

    }
    public void automateResume() {

    }

    public void testFnc() {
        System.out.println("Hello World!");
    }

    public FileWriter getFileWriter() {
        return fileWriter;
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public boolean doesFileExist() {
        return fileExist;
    }

    public void setFileExist(boolean fileExist) {
        this.fileExist = fileExist;
    }

    public boolean isFileTypeTxt() {
        return fileTypeTxt;
    }

    public void setFileTypeTxt(boolean fileTypeTxt) {
        this.fileTypeTxt = fileTypeTxt;
    }

    public boolean isFileSaved() {
        return fileSaved;
    }

    public void setFileSaved(boolean fileSaved) {
        this.fileSaved = fileSaved;
    }


    public static void main(String[] args) throws IOException {
        ResumeBOT newResumeBOT = new ResumeBOT();
        newResumeBOT.testFnc();
    }
}
