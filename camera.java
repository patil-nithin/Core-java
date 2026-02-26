class camera {

    static String brand;
    static String model;
    static int megapixels;
    static String sensorType;
    static String lensType;
    static String aperture;
    static String isoRange;
    static String shutterSpeed;
    static boolean opticalZoom;
    static boolean videoRecording;

static boolean getCameraDetails(String camBrand,String camModel,int camMegapixel,String camSensor,String camLens,String camAperture,String camIsoRange,String camShutter,boolean zoom,boolean recording){
	
	
	boolean isCameraCreated = false;
	boolean isCamBrand = false;
	boolean isCamModel = false;
	boolean isCamMegapixel = false;
	boolean isCamSensor = false;
	boolean isCamLens = false;
	boolean isCamAperture = false;
	boolean isCamIsoRange = false;
	boolean isCamShutter = false;
	boolean isZoom = false;
	boolean isRecording = false;




if (camBrand != null && !camBrand.isEmpty()) {
    isCamBrand = true;
    brand = camBrand;
} else {
    System.out.println("The input is either null or empty");
}

if (camModel != null && !camModel.isEmpty()) {
    isCamModel = true;
    model = camModel;
} else {
    System.out.println("The input is either null or empty");
}

if (camMegapixel > 0) {
    isCamMegapixel = true;
    megapixels = camMegapixel;
} else {
    System.out.println("The input is either Zero or Negative");
}

if (camSensor != null && !camSensor.isEmpty()) {
    isCamSensor = true;
    sensorType = camSensor;
} else {
    System.out.println("The input is either null or empty");
}

if (camLens != null && !camLens.isEmpty()) {
    isCamLens = true;
    lensType = camLens;
} else {
    System.out.println("The input is either null or empty");
}

if (camAperture != null && !camAperture.isEmpty()) {
    isCamAperture = true;
    aperture = camAperture;
} else {
    System.out.println("The input is either null or empty");
}

if (camIsoRange != null && !camIsoRange.isEmpty()) {
    isCamIsoRange = true;
    isoRange = camIsoRange;
} else {
    System.out.println("The input is either null or empty");
}

if (camShutter != null && !camShutter.isEmpty()) {
    isCamShutter = true;
    shutterSpeed = camShutter;
} else {
    System.out.println("The input is either null or empty");
}

if (zoom ) {
    isZoom = true;
    opticalZoom = zoom;
} else {
    System.out.println("The input is either null or empty");
}

if (recording) {
    isRecording = true;
    videoRecording = recording;
} else {
    System.out.println("The input is either null or empty");
}


if (isCamBrand == true && isCamModel == true && isCamMegapixel == true &&
    isCamSensor == true && isCamLens == true && isCamAperture == true &&
    isCamIsoRange == true && isCamShutter == true && isZoom == true &&
    isRecording == true) {

    isCameraCreated = true;
}

return isCameraCreated;

}

static void fetchDetails(){
	
	
	System.out.println("fetching details......");
	System.out.println("Camera Brand is:" + brand);
	System.out.println("Camera Model is:" + model);
	System.out.println("Megapixels is:" + megapixels);
	System.out.println("Sensor Type is:" + sensorType);
	System.out.println("Lens Type is:" + lensType);
	System.out.println("Aperture is:" + aperture);
	System.out.println("ISO Range is:" + isoRange);
	System.out.println("Shutter Speed is:" + shutterSpeed);
	System.out.println("Optical Zoom is:" + opticalZoom);
	System.out.println("Video Recording is:" + videoRecording);
	
	
	
	
	
}



}


