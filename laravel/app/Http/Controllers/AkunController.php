<?php

namespace App\Http\Controllers;

use App\Models\Akun;
use Illuminate\Http\Request;

class AkunController extends Controller
{
    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function register(Request $request)
    {
        // Gunakan request untuk mendapatkan data yg diinginkan

        // Disini aku hanya hardcode input datanya
        $username = "kaenova laravel 2";
        $password = "keren banget";

        $akun = new Akun();
        $akun->username = $username;
        $akun->password = $password;
        $akun->save();
        ddd($akun);
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
}