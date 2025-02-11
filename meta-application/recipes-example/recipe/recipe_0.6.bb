SUMMARY="a simple about to install application in rootfs "
DESCRIPTION =" recipe to install and compile source from server git QT application "

LICENSE ="CLOSED"

SRC_URI="git://github.com/Barhoumi-Nawres/Login_QT_Creator.git;protocol=https;branch=main"
SRCREV = "${AUTOREV}" 

S = "${WORKDIR}/git/login"  
# Assurez-vous d'ajouter Qt comme dépendance dans la couche Yocto
DEPENDS += "qtbase"

inherit qmake5

# Update the do_configure to point to the specific .pro file
do_configure() {
    # Point to the correct .pro file

    qmake ${S}/formulaire-RFID.pro

#this task is to generate makefile 
}

do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/build/formulaire-RFID ${D}${bindir}/

}

#B (the build directory ({WORKDIR }/build 
B = "${WORKDIR}/build"
#install -m 0755 ${B}/formulaire-RFID ${D}${bindir}/
