SUMMARY = "hello recipe"
DESCRIPTION = "Simple recipe for simple c program"
LICENSE = "CLOSED"

SRC_URI = "file://hello.c "


S = "${WORKDIR}"

do_compile(){

${CC} ${CFLAGS} -o hello-world hello.c ${LDFLAGS}
#CFLAGS :Compiler flags, such as optimization or debugging options, automatically provided by Yocto for the build.

}


do_install(){

install -d ${D}${bindir}
#that's will create directory under /usr/bin 
#/usr/bin
install -m 0755 hello-world ${D}${bindir}
#witll copie the compiled file in the directory 
#Copies the file with the specified permissions (0755 (rwx)read write execute for user group and other ).
#Destination directory for the file, which resolves to /usr/bin in the target filesystem.



}
