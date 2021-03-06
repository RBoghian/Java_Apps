package com.Adventure;

import java.util.HashSet;
import java.util.Set;

public  class HeavenlyBody {
private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody>satellites;



    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID

    }
    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyTypes) {
this.key = new Key(name,bodyTypes);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();

    }



    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    public static Key makeKey(String name, BodyTypes bodyType){
        return new Key(name,bodyType);
    }

    public boolean addSatellite(HeavenlyBody moon){

        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }
    @Override
    public final boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object instanceof HeavenlyBody){
            HeavenlyBody theObject = (HeavenlyBody) object;
            return this.key.equals(theObject.getKey());
            }

        return false;
    }

    @Override
    public final int hashCode() {

        return this.key.hashCode();

    }

    @Override
    public String toString() {
        return this.key.name + " :" + this.key.bodyType + ", " + this.getOrbitalPeriod();
    }

    public static final class Key{
        private String name;
        private BodyTypes bodyType;

        public Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key)obj;
            if(this.name == key.getName()){
                return (this.bodyType==key.bodyType);
            }
            return false;
        }

        @Override
        public String toString() {
            return this.name+" : " + this.bodyType;
        }
    }
}
