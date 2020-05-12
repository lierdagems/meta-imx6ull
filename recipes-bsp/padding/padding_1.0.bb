SUMMARY = "padding 1kb header for u-boot.imx"
DESCRIPTION = "just padding 1kb header for u-boot.imx"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://license/gpl-3.0.txt;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/lierdagems/padding.git"
SRCREV = "e5e195439a67bcc78535e7042d2d5716542cc868"

S = "${WORKDIR}/git"

inherit autotools deploy

PADDING_NAME = "padding"

do_deploy() {
    install -d ${DEPLOYDIR}
    install -m 755 ${B}/${PADDING_NAME} ${DEPLOYDIR}/
}

addtask deploy before do_build after do_compile

BBCLASSEXTEND = "native nativesdk"
