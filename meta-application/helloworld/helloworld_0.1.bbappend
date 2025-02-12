inherit systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = "systemd.service"

SRC_URI:append = " file://systemd.service "
FILES:${PN} += "${systemd_unitdir}/system/systemd.service"

do_install:append() {
  install -d ${D}/${systemd_unitdir}/system
  install -m 0644 ${WORKDIR}/systemd.service ${D}/${systemd_unitdir}/system
}
