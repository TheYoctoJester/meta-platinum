# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9273579e85f231c463bf432ce84c2479"

SRC_URI = " \
	git://github.com/TheYoctoJester/libanswer.git;protocol=https \
	file://run-ptest \
"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "620dccd6ca61729eca7828880c51d4558bef3f76"

S = "${WORKDIR}/git"

inherit cmake ptest

do_install_ptest() {
	install -m 0755 ${B}/test/*_test ${D}${PTEST_PATH}
}

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

