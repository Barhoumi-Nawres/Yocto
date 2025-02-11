SUMMARY = "Custom linux image."

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

inherit extrausers
#set rootfs to 200 MIB by defaut
IMAGE_OVERHEAD_FACTOR ?="1.0"

IMAGE_ROOTFS_SIZE ?= "204800"
#Change root password 

EXTRA_USERS_PARAMS = "\
  usermod -p '\$6\$15P8ZGhW6Pb180FQ\$cDGkGjyREmab63..22eTzlRUfS7CFF7yhyQ5VLJjKf/NuHbRWWCydAEhKDD7mTZn5b9YY1JtlLAgUrjecZ4Ko0' root; \
"
