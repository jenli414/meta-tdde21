DESCRIPTION = "Raspberry Pi Camera Python module"
HOMEPAGE    = "https://github.com/waveform80/picamera"
SECTION     = "devel/python"

inherit setuptools3

LICENSE          = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

S               = "${WORKDIR}/${PN}-${PV}"

SRC_URI         = "git://git@github.com/waveform80/picamera.git;destsuffix=${PN}-${PV}"
SRCREV_pn-${PN} = "93a0808b8a4a22c848958385818b6ed26955216f"

# Important with these dependencies
DEPENDS_${PN}   = "python3"
RDEPENDS_${PN}  = "python3"
