package my.company;

public class Main {

    public static void main(String[] args) {
int test = getBucketCount(3.26,0.75);
        System.out.println(test);
    }
    public static int getBucketCount(double width,double height, double areaPerBucket, int extraBuckets){
        double buckets=0;
        double area =0;
        double bucketArea =0;
        double remainingArea = 0;
        if((width<=0||height<=0||areaPerBucket<=0)||(extraBuckets<0)){
            return -1;
        }
        area = width*height;
        bucketArea = areaPerBucket*extraBuckets;
        remainingArea = area - bucketArea;
        buckets = remainingArea/areaPerBucket;
        return (int)Math.ceil(buckets);

    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        double buckets=0;
        double area =0;
        double bucketArea =0;
        if((width<=0||height<=0||areaPerBucket<=0)){
            return -1;
        }
        area = width*height;
        buckets = area/areaPerBucket;
        return (int)Math.ceil(buckets);
    }
    public static int getBucketCount(double area, double areaPerBucket){
        double buckets =0;
        if((area<=0||areaPerBucket<=0)){
            return -1;
        }
        buckets = area/areaPerBucket;
        return (int)(Math.ceil(buckets));
    }
}
