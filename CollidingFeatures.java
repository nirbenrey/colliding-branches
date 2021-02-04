class CollidingFeatures {
    public boolean isContainingChar(String str){
        return "def".contains(str);
    }

    public boolean isFeatureAOn(){
        return isContainingChar("a");
    }
}