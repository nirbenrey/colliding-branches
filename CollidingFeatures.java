class CollidingFeatures {
    public boolean isContainingChar(String str){
        return "abc".contains(str);
    }

    public boolean isFeatureAOn(){
        return isContainingChar("a");
    }
}