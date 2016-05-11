/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author sande
 */
@Entity
public class DriveTechnic 
{
    @Id
    @GeneratedValue
    private int driveId;
    @ManyToOne
    private Student student;
    @Embedded
    private Status posture;
    @Embedded
    private Status clutch;
    @Embedded
    private Status braking;
    @Embedded
    private Status steering;
    @Embedded
    private Status shifting;
    @Embedded
    private Status looking;
    @Embedded
    private Status parking;
    @Embedded
    private Status turning;
    @Embedded
    private Status garage;
    @Embedded
    private Status reverse;
    @Embedded
    private Status steeringPractice;
    @Embedded
    private Status hillHandbrake;
    @Embedded
    private Status hillBalancing;

    public Status getPosture() {
        return posture;
    }

    public void setPosture(Status posture) {
        this.posture = posture;
    }

    public Status getClutch() {
        return clutch;
    }

    public void setClutch(Status clutch) {
        this.clutch = clutch;
    }

    public Status getBraking() {
        return braking;
    }

    public void setBraking(Status braking) {
        this.braking = braking;
    }

    public Status getSteering() {
        return steering;
    }

    public void setSteering(Status steering) {
        this.steering = steering;
    }

    public Status getShifting() {
        return shifting;
    }

    public void setShifting(Status shifting) {
        this.shifting = shifting;
    }

    public Status getLooking() {
        return looking;
    }

    public void setLooking(Status looking) {
        this.looking = looking;
    }

    public Status getParking() {
        return parking;
    }

    public void setParking(Status parking) {
        this.parking = parking;
    }

    public Status getTurning() {
        return turning;
    }

    public void setTurning(Status turning) {
        this.turning = turning;
    }

    public Status getGarage() {
        return garage;
    }

    public void setGarage(Status garage) {
        this.garage = garage;
    }

    public Status getReverse() {
        return reverse;
    }

    public void setReverse(Status reverse) {
        this.reverse = reverse;
    }

    public Status getSteeringPractice() {
        return steeringPractice;
    }

    public void setSteeringPractice(Status steeringExercise) {
        this.steeringPractice = steeringExercise;
    }

    public Status getHillHandbrake() {
        return hillHandbrake;
    }

    public void setHillHandbrake(Status hillHandbrake) {
        this.hillHandbrake = hillHandbrake;
    }

    public Status getHillBalancing() {
        return hillBalancing;
    }

    public void setHillBalancing(Status hillBalancing) {
        this.hillBalancing = hillBalancing;
    }

    public DriveTechnic(Status posture, Status clutch, Status braking, Status steering, Status shifting, Status looking, Status parking, Status turning, Status garage, Status reverse, Status steeringPratice, Status hillHandbrake, Status hillBalancing) {
        this.posture = posture;
        this.clutch = clutch;
        this.braking = braking;
        this.steering = steering;
        this.shifting = shifting;
        this.looking = looking;
        this.parking = parking;
        this.turning = turning;
        this.garage = garage;
        this.reverse = reverse;
        this.steeringPractice = steeringPratice;
        this.hillHandbrake = hillHandbrake;
        this.hillBalancing = hillBalancing;
    }
    /*kopie constructor*/
    public DriveTechnic(DriveTechnic other){
        this.posture = new Status(other.posture);
        this.clutch = new Status(other.clutch);
        this.braking = new Status(other.braking);
        this.steering = new Status(other.steering);
        this.shifting = new Status(other.shifting);
        this.looking = new Status(other.looking);
        this.parking = new Status(other.parking);
        this.turning = new Status(other.turning);
        this.garage = new Status(other.garage);
        this.reverse = new Status(other.reverse);
        this.steeringPractice = new Status(other.steeringPractice);
        this.hillHandbrake = new Status(other.hillHandbrake);
        this.hillBalancing = new Status(other.hillBalancing);
    }
    
    public DriveTechnic(){
        this.posture = new Status();
        this.clutch = new Status();
        this.braking = new Status();
        this.steering = new Status();
        this.shifting = new Status();
        this.looking = new Status();
        this.parking = new Status();
        this.turning = new Status();
        this.garage = new Status();
        this.reverse = new Status();
        this.steeringPractice = new Status();
        this.hillHandbrake = new Status();
        this.hillBalancing = new Status();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.driveId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DriveTechnic other = (DriveTechnic) obj;
        if (this.driveId != other.driveId) {
            return false;
        }
        return true;
    }
    
    
}
