package ch.baesi.crypto.authentication.practical.mac

import ch.baesi.crypto.authentication.generic.mac.GenericMacScheme

interface MacScheme: GenericMacScheme<String, String> {
}