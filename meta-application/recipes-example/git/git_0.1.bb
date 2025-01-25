SUMMARY = "Yocto recipe to fetch and build the camera directory from GitHub"
DESCRIPTION = "Recipe for building a Qt-based graphical interface located in the 'camera' subdirectory."
LICENSE = "CLOSED"

SRC_URI = "git://github.com/Barhoumi-Nawres/Creation-of-a-graphical-interface.git;branch=main;protocol=https"
SRCREV = "${AUTOREV}"

# Specify the work directory for the 'camera' subdirectory
S = "${WORKDIR}/git/camera"

DEPENDS = "qtbase qttools qtserialport"
RDEPENDS:${PN} = "qtbase qttools"

inherit qmake5

do_configure:prepend() {
    export QT_SELECT=5
}

do_install() {
    # Install the application binary
    install -d ${D}/usr/bin
    install -m 0755 ${B}/camera ${D}/usr/bin/camera
}

FILES:${PN} += "/usr/bin/camera"
