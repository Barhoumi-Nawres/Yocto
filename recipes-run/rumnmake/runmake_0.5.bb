SUMMARY = "Calculation recipe"
DESCRIPTION = "Recipe using the makefile"

LICENSE = "CLOSED"
SRC_URI = "file://main.c \
           file://operation.h \
           file://operation.c \
          "

S = "${WORKDIR}"

do_compile() {
    ${CC} ${CFLAGS} ${LDFLAGS} main.c operation.c -o calculation
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 calculation ${D}${bindir}
}

