# This is a post build script.  The actual build is done by ant which should be called before calling this script

BUILD_VERSION=$1
BUILD_OUTPUT_DIR=$2
MANIFEST="./build_manifest.txt"
DIST_DIR=$BUILD_VERSION

function usage()
{
   echo "Usage: cmbuild.sh <Build Version> <Build Output Directory>"
}

if [ "$BUILD_VERSION" = "" ]; then
   echo "ERROR: No build version parameter provided."
   usage
   exit 1
fi

if [ "$BUILD_OUTPUT_DIR" = "" ]; then
   echo "ERROR: No build output directory parameter provided."
   usage
   exit 1
fi

function createManifest()
{
   dateStr=`date`
   echo "Web Services Build Manifest" > $MANIFEST
   echo "Date: $dateStr" >> $MANIFEST
   echo "Build Number: $BUILD_VERSION" >> $MANIFEST
}

createManifest

cp $MANIFEST $DIST_DIR

zip -r $BUILD_OUTPUT_DIR/$BUILD_VERSION-distribution.zip $DIST_DIR

ERROR_CODE=$?

if [ $ERROR_CODE != 0 ]
then
 echo "ZIP FILE CREATE FAILURE--ERROR $ERROR_CODE"
 exit 1
fi

cp -r $DIST_DIR $BUILD_OUTPUT_DIR
ERROR_CODE=$?

if [ $ERROR_CODE != 0 ]
then
 echo "cp -r $DIST_DIR $BUILD_OUTPUT_DIR --ERROR $ERROR_CODE"
 exit 1
fi

exit 0


