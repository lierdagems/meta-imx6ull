LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel

# SRC_URI
SRC_URI = "git://github.com/lierdagems/linux-imx.git"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

do_configure() {
	oe_runmake ${KBUILD_DEFCONFIG} -C ${S} O=${B}
}

MODULE_TARBALL_DEPLOY = "0"
