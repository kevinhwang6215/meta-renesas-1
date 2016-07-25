require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

KORG_ARCHIVE_COMPRESSION = "xz"
COMPATIBLE_MACHINE = "(skrzg1m|skrzg1e)"
PV_append = "+git${SRCREV}"

RENESAS_URL="git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git"
SRCREV = "0d1912303e54ed1b2a371be0bba51c384dd57326"
SRC_URI = " \
    ${RENESAS_URL};protocol=git;branch=linux-4.4.y \
"
S = "${WORKDIR}/git"
