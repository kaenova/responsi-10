<?php

use App\Http\Controllers\AdminController;
use App\Http\Controllers\AkunController;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/akun/register', [AkunController::class, 'register']);

Route::get('/admin/login', [AdminController::class, 'login']);
Route::get('/admin/buat_toko', [AdminController::class, 'buat_toko']);
Route::get('/admin/buat_barang', [AdminController::class, 'buat_barang']);
Route::get('/admin/sematkan_barang_toko', [AdminController::class, 'sematkan_barang_toko']);



